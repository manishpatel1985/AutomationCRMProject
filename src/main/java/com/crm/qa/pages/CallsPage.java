package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class CallsPage extends TestBase {
	
	public CallsPage() {
		PageFactory.initElements(driver, this);
		Assert.assertTrue(callslable.isDisplayed());
	}
	
	@FindBy (xpath="//div[text()='Calls']") 
	WebElement callslable;
	
	
	
	
	
	

}
