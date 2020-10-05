package com.crm.qa.testscases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class CompaniesPageTest  extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CompaniesPage companiesPage;

	public CompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
	initialization();
	loginPage = new LoginPage();
	homePage = loginPage.correctLoginUser(prop.getProperty("username"), prop.getProperty("password"));
	homePage.clickOnCompniesLink();
	companiesPage = new CompaniesPage();
	}
	
	
	
	@Test(priority=1)
	public void selectNameCheckBoxTest() {
	boolean check=	companiesPage.selectNameCheckBox();
	Assert.assertTrue(check);
	}
	
	@Test(priority=2)
	public void selectDeleteTest() {
	boolean delete = companiesPage.selectDelete();	
	Assert.assertTrue(delete);
		
	}
	
	@Test(priority=3)
	public void actionLabelCheckTest() {
	Assert.assertTrue(companiesPage.actionLabelCheck());
	}
	
	
	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}
	
	
	
	
	
	
	
	
}
