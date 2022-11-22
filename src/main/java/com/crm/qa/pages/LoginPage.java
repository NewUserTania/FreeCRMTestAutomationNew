package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement lgnbtn;
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement logon;
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signup;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgnbtn.click();
		return new HomePage();
		
	}

	public String validateLoginPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}



	public boolean validateLogoOfThePage() {
		// TODO Auto-generated method stub
		return logon.isDisplayed();
	}

	
}
