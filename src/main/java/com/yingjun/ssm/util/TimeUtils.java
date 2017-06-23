package com.yingjun.ssm.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * TimeUtils
 * 
 */
public class TimeUtils {
	private final static long minute = 60 * 1000;// 1分钟
	private final static long hour = 60 * minute;// 1小时
	private final static long day = 24 * hour;// 1天
	private final static long month = 31 * day;// 月
	private final static long year = 12 * month;// 年


	public static final SimpleDateFormat DATE_FORMAT_DATE_D = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat DATE_FORMAT_DATE_M = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	public static final SimpleDateFormat DATE_FORMAT_DATE_S = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static Date getDateFromString(String s){
		Calendar calendar = Calendar.getInstance();
		if (s == null) {
			return calendar.getTime();
		}
		calendar.set(Calendar.YEAR, Integer.parseInt(s.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(s.substring(4, 6)) - 1);
		calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(s.substring(6, 8)));
		calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(s.substring(8, 10)));
		calendar.set(Calendar.MINUTE, Integer.parseInt(s.substring(10, 12)));
		calendar.set(Calendar.SECOND, Integer.parseInt(s.substring(12, 14)));
		return calendar.getTime();
	}
	
	public static void main(String[] args) {
		String s = "20171230215603";
		System.out.println(getDateFromString(s).toLocaleString());
	}
	
	private TimeUtils() {
		throw new AssertionError();
	}

	/**
	 * long time to string
	 * 
	 * @param timeInMillis
	 * @param dateFormat
	 * @return
	 */
	public static String getTime(long timeInMillis, SimpleDateFormat dateFormat) {
		return dateFormat.format(new Date(timeInMillis));
	}

	/**
	 * long time to string, format is {@link #DEFAULT_DATE_FORMAT}
	 * 
	 * @param timeInMillis
	 * @return
	 */
	public static String getTime(long timeInMillis) {
		return getTime(timeInMillis, DATE_FORMAT_DATE_S);
	}

	/**
	 * get current time in milliseconds
	 * 
	 * @return
	 */
	public static long getCurrentTimeInLong() {
		return System.currentTimeMillis();
	}

	/**
	 * get current time in milliseconds, format is {@link #DEFAULT_DATE_FORMAT}
	 * 
	 * @return
	 */
	public static String getCurrentTimeInString() {
		return getTime(getCurrentTimeInLong());
	}

	/**
	 * get current time in milliseconds
	 * 
	 * @return
	 */
	public static String getCurrentTimeInString(SimpleDateFormat dateFormat) {
		return getTime(getCurrentTimeInLong(), dateFormat);
	}

	
	public static Long getTimeFormatText(Date date) {
		if (date == null) {
			return null;
		}
		long diff = new Date().getTime() - date.getTime();
		long r = 0;
		if (diff > month) {
			r = (diff / month);
			return r;
		}
		return 0L;
	}
}
