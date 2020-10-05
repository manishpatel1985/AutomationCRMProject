package com.crm.qa.testscases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.CampaignsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CampaignsPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	CampaignsPage campaignsPage;
	
	
	
	public CampaignsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homePage=loginpage.correctLoginUser(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnCampaignLinkPage();
		campaignsPage = new CampaignsPage();
	}
	
	@Test
	public void clickOnNewLinkTest() {
		boolean flag=campaignsPage.clickOnNewButton();
		Assert.assertTrue(flag);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
