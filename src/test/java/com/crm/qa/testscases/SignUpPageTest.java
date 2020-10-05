package com.crm.qa.testscases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase{
	LoginPage loginpage;
	HomePage  homepage;
	SignUpPage signUpPage;
	
	
	
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		initialization();
		loginpage = new LoginPage();
		loginpage.clickOnSignUpPage();
		signUpPage = new SignUpPage();
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
