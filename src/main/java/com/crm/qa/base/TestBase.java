package com.crm.qa.base;


import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	public TestBase() {
		try {
			prop=new Properties();
			
			FileInputStream file=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\"
					+ "FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(file);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unused")
	public static void initialization() {
		if(prop.getProperty("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		Dimension dm=new Dimension();
		dm.setSize(200,200);
//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_timeout,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
}
	
	
	
	

