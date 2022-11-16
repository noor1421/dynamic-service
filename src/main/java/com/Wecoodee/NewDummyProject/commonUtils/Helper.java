package com.Wecoodee.NewDummyProject.commonUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

	public static Date getCurrentDateTime() {
		return new Date(new java.util.Date().getTime());
	}

	public static Date getCurrentDateAndTime() {
		return new Date();
	}

	public static Date getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(sdf.format(new Date()));
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
