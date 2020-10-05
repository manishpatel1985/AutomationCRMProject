package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class DealsPage extends TestBase {
	
	@FindBy(xpath="//div[text()='Deals']")
	WebElement dealslabel;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//div[text()='Actions']")
	WebElement selectactions;
	
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	WebElement selectdelete;
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
		Assert.assertTrue(dealslabel.isDisplayed());
	}

	
	
	public boolean clickOnCheckBox() {
	checkbox.click();
	return	checkbox.isEnabled();
		
	}
	
	public boolean selectDelete() {
		selectactions.click();
		selectdelete.click();
	return	selectdelete.isEnabled();
	}
	

}
