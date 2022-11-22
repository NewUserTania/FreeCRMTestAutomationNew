package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'Tania Roy')]")
	WebElement idName;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactButton;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTileHomePage() {
		return driver.getCurrentUrl();
	}
	
	
	
	public ContactsPage clickContact() {
		contactButton.click();
		return new ContactsPage();
	}
	public DealsPage clickDeals() {
		dealsButton.click();
		return new DealsPage();
	}

	public boolean verifyCorrectIdName() {
		// TODO Auto-generated method stub
		return idName.isDisplayed();
	}

}
