package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class DocumentsPage extends TestBase {
	
	public DocumentsPage() {
		PageFactory.initElements(driver, this);
		Assert.assertTrue(documentslabel.isDisplayed());
	}

	@FindBy (xpath="//div[text()='Documents']") 
	WebElement documentslabel;
	
	
	
	
	
	
}



