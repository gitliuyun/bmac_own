package com.yingjun.ssm.service;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
/**
 * 文件导入
 * @author yang
 *
 */
public interface FileImportService {

	/**
	 * 导入商户信息
	 * @param file
	 * @return
	 */
	String importShopInfo(List<List<Object>> list);
	
	/**
	 * 导入单位信息
	 * @param list
	 * @return
	 */
	String importUnitInfo(List<List<Object>> list);
	
	/**
	 * 导入开卡信息
	 * 保存机型信息到机型表
	 * @param file
	 * @return
	 */
	String importCardInfo(List<List<Object>> list) throws ParseException;
	
	/**
	 * 导入交易信息，并补全机型和电话号码信息
	 * @param file
	 * @return
	 */
	String importTransactionInfo(File file) throws IOException, CloneNotSupportedException;
	
	/**
	 * 更新登记时间，取机型首次登记时间
	 */
	String updateRegister(List<List<Object>> list) throws ParseException;
}
