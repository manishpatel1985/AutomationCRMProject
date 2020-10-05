package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class FormsPage extends TestBase {
	
	public FormsPage() {
		PageFactory.initElements(driver, this);
		Assert.assertTrue(formslabel.isDisplayed());
	}
	
	@FindBy (xpath="//div[text()='Forms']") 
	WebElement formslabel;
	

	
	
	
	
	
}
