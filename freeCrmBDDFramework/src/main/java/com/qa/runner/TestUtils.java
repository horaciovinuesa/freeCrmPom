package com.qa.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtils {
	
	//Int values for configuration
	static int PAGE_LOAD_TIMEOUT = 20;
	static int IMPLICIT_WAIT = 30;
	
	//String verifications Login and Homepage
	public static String LOGIN_PAGE_TITLE = "#1 Free CRM software in the cloud for sales and service";
	public static String HOME_PAGE_TITLE = "CRMPRO";
	
	//String for screenshot generation
	public static String TIME_STAMP = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
}

