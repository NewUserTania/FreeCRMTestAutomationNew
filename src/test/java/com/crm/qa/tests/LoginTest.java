package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase {

	public static LoginPage loginPage;
	public static HomePage homePage;
	
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		
	}
	@Test(priority=0)
	public void titleTest() {
		String titleOfPage=loginPage.validateLoginPageTitle();
		Assert.assertEquals(titleOfPage, "Free CRM  - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=1)
	public void logoTest() {
		Assert.assertTrue(loginPage.validateLogoOfThePage());
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
