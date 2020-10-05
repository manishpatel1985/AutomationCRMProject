package com.crm.qa.testscases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CalenderPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage  homepage;
	CalenderPage calenderPage;
	
	public CalenderPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.correctLoginUser(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnCalenderLink();
		calenderPage = new CalenderPage();
	}
	
	
	
	
	@Test(priority=1)
	public void selectMonthOnCalenderTest() {
	boolean flag =calenderPage.selectMonthOnCalender();
	Assert.assertTrue(flag);
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}
	
	

}
