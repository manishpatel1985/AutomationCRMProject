package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class CasesPage extends TestBase{
	
	public CasesPage() {
		PageFactory.initElements(driver, this);
	Assert.assertTrue(caseslabel.isDisplayed());
		
	}
	
	@FindBy(xpath="//div[text()='Cases']")
	WebElement caseslabel;
	

}
