package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class CompaniesPage extends TestBase {
	
	public CompaniesPage() {
		PageFactory.initElements(driver, this);
		Assert.assertTrue(companylabel.isDisplayed());
		
	}

	@FindBy(xpath="//div[text()='Companies']")
	WebElement companylabel;
	
	@FindBy(xpath="//th[text()='Name']")
	WebElement namecheckbox;
	
	@FindBy(xpath="//div[@class='ui fluid container']//tr[1]//td[2]")
	WebElement selectdipak;
	
	@FindBy(xpath="//td[text()='ManishPatel']")
	WebElement selectmanish;
	
	@FindBy(xpath="//div[text()='Actions']")
	WebElement selectaction;
	
	
	@FindBy(xpath="//span[text()='Delete']")
	WebElement selectdelete;
	
	@FindBy(xpath="//th[text()='Address']")
	WebElement actionlable;
	
	@FindBy(xpath="//div[text()='View']")
	WebElement selectview;
	
	@FindBy(xpath="//span[text()='Default View']")
	WebElement selectdefaultview;
	
	
	
	public boolean selectNameCheckBox() {
		namecheckbox.click();
		return selectdipak.isEnabled();
		
	}
	
	public boolean selectDelete() {
		selectaction.click();
		selectdelete.click();
	return	selectdelete.isEnabled();
		
	}
	
	public boolean actionLabelCheck() {
	return	actionlable.isDisplayed();
		
	}
	
	public void selectView() {
		selectview.click();
		selectdefaultview.click();
	}
	
	
	
}
