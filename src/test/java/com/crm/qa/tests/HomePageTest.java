package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	public static LoginPage loginPage;
	public static HomePage homePage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
	}
	
	@Test
	public void VerifyHomePageTilteTest() {
		String homePageTitle = homePage.verifyTileHomePage();
		Assert.assertEquals(homePageTitle,"CRMPRO");
	}
	
	
	@Test
	public void verifyCorrectIdNameTest() {
		
		Assert.assertTrue(homePage.verifyCorrectIdName());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
