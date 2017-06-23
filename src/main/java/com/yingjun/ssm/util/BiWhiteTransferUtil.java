package com.yingjun.ssm.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.yingjun.ssm.entity.Biwhiteardinfotb;

public class BiWhiteTransferUtil {
	public static Biwhiteardinfotb transferRowToBean(List<Object> tableHead, List<Object> data) {
		Biwhiteardinfotb biwhiteardinfotb = new Biwhiteardinfotb();
		for (int i = 0; i < tableHead.size(); i ++) {
			if (i > 10) {
				break;
			}
			String headName = tableHead.get(i).toString();
			String colName = data.get(i).toString();
			switch (headName) {
			case "卡号":
				biwhiteardinfotb.setCardno(colName);
				break;
			case "发卡类型":
				biwhiteardinfotb.setKktype(colName);
				break;
			case "销售单位":
				biwhiteardinfotb.setUnitcode(colName.substring(0, colName.length() - 3));
				break;
			case "手机号":
				biwhiteardinfotb.setMobileno(colName);
				break;
			case "手机品牌":
				biwhiteardinfotb.setProductcompany(colName);
				break;
			case "手机型号":
				biwhiteardinfotb.setProductmodel(colName);
				break;
			case "发卡日期":
				biwhiteardinfotb.setRsvd(colName);
				break;
			default:
				break;
			}
		}
		if (biwhiteardinfotb.getRsvd() == null) {
			SimpleDateFormat sFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			biwhiteardinfotb.setRsvd(sFormat.format(new Date()));
		}
		
		return biwhiteardinfotb;
	}
}
