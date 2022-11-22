package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long page_load_timeout=50;
	public static long implicit_timeout=20;
	
	public void switchToFrame() {
		driver.switchTo().frame("processFrame");
	}
	
	//<!DOCTYPE suite SYSTEM "http://testng.org/testng-2.4.dtd"> 

}
