package com.yingjun.ssm.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yingjun.ssm.dao.BiwhiteardinfotbDao;
import com.yingjun.ssm.dao.DictbmacunitcodetbDao;
import com.yingjun.ssm.dao.DictshopcodetbDao;
import com.yingjun.ssm.dao.MachineinfoDao;
import com.yingjun.ssm.dao.TjtsmcardtxnjrltbDao;
import com.yingjun.ssm.entity.Biwhiteardinfotb;
import com.yingjun.ssm.entity.Dictbmacunitcodetb;
import com.yingjun.ssm.entity.Dictshopcodetb;
import com.yingjun.ssm.entity.Machineinfo;
import com.yingjun.ssm.entity.Tjtsmcardtxnjrltb;
import com.yingjun.ssm.service.FileImportService;
import com.yingjun.ssm.util.BiWhiteTransferUtil;
import com.yingjun.ssm.util.TimeUtils;
@Service
public class FileImportServiceImpl implements FileImportService {
	@Autowired
	private DictshopcodetbDao dictshopcodetbDao;
	
	@Autowired
	private DictbmacunitcodetbDao dictbmacunitcodetbDao;
	
	@Autowired
	private BiwhiteardinfotbDao biwhiteardinfotbDao;
	
	@Autowired
	private TjtsmcardtxnjrltbDao tjtsmcardtxnjrltbDao;
	
	@Autowired
	private MachineinfoDao machineinfoDao;
	
	@Override
	public String importShopInfo(List<List<Object>> list) {
		List<String> shopList = dictshopcodetbDao.queryExistShopNo();
		for (int i = 1; i < list.size(); i++) {
			List<Object> row = list.get(i);
			if (!shopList.contains(row.get(0).toString())) {
				Dictshopcodetb shop = new Dictshopcodetb();
				shop.setShopno(row.get(0).toString());
				shop.setRsvd(row.get(1).toString().substring(0, 8));
				shop.setShopname(row.get(2).toString());
				dictshopcodetbDao.insert(shop);
			}
		}
		return "OK";
	}
	
	@Override
	public String importUnitInfo(List<List<Object>> list) {
		List<String> existUnitIds = dictbmacunitcodetbDao.queryExistUnitId();
		for (int i = 1; i < list.size(); i++) {
			List<Object> row = list.get(i);
			String unitId = row.get(0).toString().substring(0, 8);
			if (!existUnitIds.contains(unitId)) {
				Dictbmacunitcodetb dic = new Dictbmacunitcodetb();
				dic.setUnitid(unitId);
				dic.setUnitname(row.get(1).toString());
				dictbmacunitcodetbDao.insert(dic);
			}
		}
		return "OK";
	}

	@Override
	public String importCardInfo(List<List<Object>> list) throws ParseException {
		List<String> existDeviceTypes =  machineinfoDao.queryAllDeviceType();
		List<String> existCardNos = biwhiteardinfotbDao.queryAllCardNo();
		Set<String> deviceSet = new HashSet<>();
		for (int i = 1; i < list.size(); i++) {
			List<Object> row = list.get(i);
			Biwhiteardinfotb biwhiteardinfotb = BiWhiteTransferUtil.transferRowToBean(list.get(0), row);
			if (biwhiteardinfotb.getProductmodel() == null) {
				continue;
			}
			String productModal = biwhiteardinfotb.getProductmodel().toUpperCase();
			if (!existCardNos.contains(biwhiteardinfotb.getCardno())) {
				Biwhiteardinfotb card = new Biwhiteardinfotb();
				card.setProductmodel(productModal);
				card.setCardno(biwhiteardinfotb.getCardno());
				//发卡日期
				card.setRsvd(biwhiteardinfotb.getRsvd());
				card.setKktype(biwhiteardinfotb.getKktype());
				card.setUnitcode(biwhiteardinfotb.getUnitcode());
				card.setMobileno(biwhiteardinfotb.getMobileno());
				card.setProductcompany(biwhiteardinfotb.getProductcompany());
				
				if (!existDeviceTypes.contains(productModal) && !deviceSet.contains(productModal)) {
					Machineinfo info = new Machineinfo();
					info.setDevicetype(productModal);
					info.setDevicecompany(card.getProductcompany());
					info.setRecordtime(TimeUtils.getDateFromString(card.getRsvd()));
					machineinfoDao.insert(info);
					deviceSet.add(productModal);
				}
				biwhiteardinfotbDao.insert(card);
				
			}
			Tjtsmcardtxnjrltb update = new Tjtsmcardtxnjrltb();
			update.setCardno(biwhiteardinfotb.getCardno());
			update.setMobileno(biwhiteardinfotb.getMobileno());
			update.setProductcompany(biwhiteardinfotb.getProductcompany());
			update.setProductmodel(productModal);
			tjtsmcardtxnjrltbDao.updateByCardNo(update);
		}
		return "OK";
	}
	
	//更新登记日期
	@Override
	public String updateRegister(List<List<Object>> list) throws ParseException {
		for (int i = 1; i < list.size(); i++) {
			List<Object> row = list.get(i);
			Biwhiteardinfotb biwhiteardinfotb = BiWhiteTransferUtil.transferRowToBean(list.get(0), row);
			if (biwhiteardinfotb.getProductmodel() == null) {
				continue;
			}
			Machineinfo mi = machineinfoDao.queryByMachineType(biwhiteardinfotb.getProductmodel());
			if (mi != null) {
				if (mi.getRecordtime().compareTo(TimeUtils.getDateFromString(biwhiteardinfotb.getRsvd())) > 0) {
					mi.setRecordtime(TimeUtils.getDateFromString(biwhiteardinfotb.getRsvd()));
					machineinfoDao.updateByPrimaryKey(mi);
				}
			}
		}
		return "OK";
	}

	@Override
	public String importTransactionInfo(File file) throws IOException, CloneNotSupportedException {
		List<String> existFileIds = tjtsmcardtxnjrltbDao.queryExistFileIds();
		if (existFileIds.contains(file.getName())) {
			return "OK";
		}
		Tjtsmcardtxnjrltb tj = new Tjtsmcardtxnjrltb();
		tj.setFileid(file.getName());
		LineIterator it = FileUtils.lineIterator(file, "UTF-8");
		try {
		    while (it.hasNext()) {
		    	String fileHead = it.nextLine();
		    	tj.setFilever(fileHead.substring(0, 2));
		    	tj.setBirthdate(fileHead.substring(2,10));
		        break;
		    }
		    Integer count = 0;
		    List<Biwhiteardinfotb> existInfo = biwhiteardinfotbDao.queryAllCardInfo();
		    List<Tjtsmcardtxnjrltb> insertList = new ArrayList<>();
		    while (it.hasNext()) {
		    	Tjtsmcardtxnjrltb temp = (Tjtsmcardtxnjrltb)tj.clone();
		        String line = it.nextLine();
		        temp.setFileno(count.toString());
		        temp.setCardno(line.substring(0, 16));
		        temp.setCardtype(line.substring(16, 17));
		        temp.setTransdate(line.substring(17, 25));
		        temp.setTranstype(line.substring(25, 26));
		        temp.setTotalnum(Integer.parseInt(line.substring(26,34)));
		        temp.setTotalsum(Integer.parseInt(line.substring(34, 42)));
		        temp.setIndustrycode(line.substring(42, 46));
		        temp.setUnitid(line.substring(46, 54));
		        temp.setUnitcode("YD");
		        temp.setUnitno("YD");
		        temp.setShopno(line.substring(54, 66));
		        for (Biwhiteardinfotb info:existInfo) {
		        	if (info.getCardno().equals(temp.getCardno())) {
		        		temp.setMobileno(info.getMobileno());
		        		temp.setProductcompany(info.getProductcompany());
		        		temp.setProductmodel(info.getProductmodel());
		        		break;
		        	}
		        }
		        insertList.add(temp);
		        count ++;
		        if (count == 1000) {
		        	tjtsmcardtxnjrltbDao.batchInsert(insertList);
		        	insertList.clear();
		        }
		    }
		    if (!insertList.isEmpty()) {
		    	tjtsmcardtxnjrltbDao.batchInsert(insertList);
		    }
		} finally {
		    it.close();
		}
		return "OK";
	}
}
