package com.crm.qa.pages;



import java.util.Iterator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;


public class ContactsPage extends TestBase{
	
	 public ContactsPage() {
		PageFactory.initElements(driver, this);
		Assert.assertTrue(contactslabel.isDisplayed());
	 }
	
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement contactslabel;
	
	@FindBy(xpath="//td[text()='Dipak Mafatlal Patel']")
	WebElement selectcontactdipak;
	
	@FindBy(xpath="//td[text()='Manish Mahendrakumar Patel']")
	WebElement selectcontactmanish;
	
	@FindBy(xpath="//div[text()='vishal patel']")
	WebElement selectcontactvishalpatel;
	
	@FindBy(xpath="//a[text()='Free account']")
	WebElement freeaccountlink;
	
	///////////////////////////////////////////
	@FindBy(xpath="//button[text()='New']")
	WebElement clickonnewbutton;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middlename;
	
	
	
	@FindBy(xpath="//div[@name='company']//input[@class='search']")
	WebElement entercompanyname;
	
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement savebutton;
	
	
	
	public boolean selectContactDipak() {
		selectcontactdipak.click();
	return	selectcontactdipak.isEnabled();
	}
	
	public boolean selectContactManish() {
		selectcontactmanish.click();
		return selectcontactmanish.isEnabled();
	}
	
	public boolean createContacts(String fn, String ln, String midname, String comp )   {
		clickonnewbutton.click();
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		middlename.sendKeys(midname);
		entercompanyname.sendKeys(comp);
		savebutton.click();
		return	freeaccountlink.isEnabled();
		
	
	}
	
	
	

	
}
