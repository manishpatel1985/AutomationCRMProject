package com.crm.qa.testscases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage  homepage;
	ContactsPage contactsPage;
	String sheetName ="Sheet1";
	
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.correctLoginUser(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnContactsLink();
		contactsPage = new ContactsPage();
	}
	
	
	
	@Test(priority=1)
	public void selectContactDipakTest() {
	Assert.assertTrue(contactsPage.selectContactDipak());
	}
	
	@Test(priority=2)
	public void selectContactManishTest() {
	Assert.assertTrue(contactsPage.selectContactManish());
	}
	
	/*@Test(priority=3)
	public void deleteContactsTest() throws InterruptedException {
		Assert.assertTrue(contactsPage.deleteContactColin());
		Assert.assertTrue(contactsPage.deleteContactMatt());
		Assert.assertTrue(contactsPage.deleteContactDominic());
	}*/
	
	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] =TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getCRMTestData")
	public void createNewContactsTest(String firstname, String lastname, String middlename, String company) {
	contactsPage.createContacts(firstname, lastname, middlename, company);	
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}
	
	
	
	

}
