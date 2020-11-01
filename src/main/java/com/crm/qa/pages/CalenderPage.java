package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class CalenderPage extends TestBase{

	@FindBy(xpath="//i[@class='chevron right icon']")
	WebElement selectcalendermonth;
	
	@FindBy(xpath="//div[@class='rbc-date-cell']//a[text()='02']")
	WebElement selectcalenderdate;

	@FindBy(xpath="//span[@class='rbc-toolbar-label'][text()='0002 Dec 02']")
	WebElement correctdate;
	
	@FindBy(xpath="//h3[text()='Events']")
	WebElement eventslable;
	
	
	public CalenderPage() {
		PageFactory.initElements(driver, this);
		boolean evelable = eventslable.isDisplayed();
		Assert.assertTrue(evelable);
	}
	
	
	
	public boolean selectMonthOnCalender() {
		selectcalendermonth.click();
		
		selectcalenderdate.click();
		return	correctdate.isEnabled();
	}
	
	
	
	
	
	
}
