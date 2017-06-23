package com.yingjun.ssm.service;

import javax.servlet.http.HttpSession;

/**
 * 交易分析
 * @author yang
 *
 */
public interface TransactionAnalyzeService {

	/**
	 * 分析机型使用信息
	 * @param machineType
	 */
	void analyzeMachine(String machineType);
	/**
	 * 分析所有机型
	 */
	String analyzeMachineAll(HttpSession session) throws InterruptedException;
	
}
