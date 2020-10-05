package com.crm.qa.testscases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class DealsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	DealsPage dealsPage;
	
	
	
	public DealsPageTest() {
		super();
		 
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		loginpage.correctLoginUser(prop.getProperty("username"), prop.getProperty("password"));
		homePage=new HomePage();
		homePage.clickOnDealsLink();
		dealsPage = new DealsPage();
	}
	
	
	
	@Test(priority=1)
	public void clickOnCheckBoxTest() {
	Assert.assertTrue(dealsPage.clickOnCheckBox());
		
	}
	
	@Test(priority=2)
	public void selectDeleteTest() {
	boolean select=	dealsPage.selectDelete();
	Assert.assertTrue(select);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}
	
	
	
	

}
