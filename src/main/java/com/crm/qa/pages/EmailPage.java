package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class EmailPage extends TestBase{
	
	
	public EmailPage() {
		PageFactory.initElements(driver, this);
	Assert.assertTrue(composebutton.isDisplayed());
		
	}

	@FindBy (xpath="//button[text()='Compose']") 
	WebElement composebutton;
	
}
