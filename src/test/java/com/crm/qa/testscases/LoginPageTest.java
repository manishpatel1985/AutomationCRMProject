package com.crm.qa.testscases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;



public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage  homepage;
	SignUpPage signUpPage;
	
	public LoginPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage= new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
	String title = loginpage.gettingLoignPageTitle();
	Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	
	@Test(priority=2)
	public void correctUserNameAndCorrectPasswordloginPageTest() {
		homepage = loginpage.correctLoginUser(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=3)
	public void incorrectUserNameloginTest() {
	loginpage.inCorrectUserNameLogin(prop.getProperty("wrongusername"), prop.getProperty("password"));
	}
	
	@Test(priority=4)
	public void incorrectPasswordloginPageTest() {
	loginpage.inCorrectPasswordNameLogin(prop.getProperty("username"), prop.getProperty("wrongpassword"));
	}
	
	
	@Test(priority=5)
	public void SignUpPageTest() {
	signUpPage=	loginpage.clickOnSignUpPage();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
