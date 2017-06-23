package com.yingjun.ssm.util;

import java.util.List;

import com.yingjun.ssm.entity.WhiteListSummary;

public class VOTransferUtil {
	public static List<WhiteListSummary> transferVOForShow(List<WhiteListSummary> detailList){
		for (WhiteListSummary ws:detailList) {
			if ("1".equals(ws.getTranstype())) {
				ws.setTranstype("消费");
			} else if ("2".equals(ws.getTranstype())) {
				ws.setTranstype("充值");
			} else if ("3".equals(ws.getTranstype())) {
				ws.setTranstype("补票");
			} else {
			}
			switch (ws.getIndustrycode()) {
			case "7510":
				ws.setIndustrycode("公交");
				break;
			case "7511":
				ws.setIndustrycode("代理");
				break;
			case "7512":
				ws.setIndustrycode("出租");
				break;
			case "7513":
				ws.setIndustrycode("地铁");
				break;
			case "7514":
				ws.setIndustrycode("小额消费");
				break;
			case "7516":
				ws.setIndustrycode("旅游业");
				break;
			case "7515":
				ws.setIndustrycode("高速路");
				break;

			default:
				break;
			}
		}
		return detailList;
	};
}
