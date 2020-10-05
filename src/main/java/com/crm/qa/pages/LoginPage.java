package com.crm.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class LoginPage extends TestBase {
	//Initializing page factory
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	Assert.assertTrue(forgotpasswordlink.isEnabled());
	}

	//PageFactory/ObjectReposetory:-
	@FindBy(linkText="Forgot your password?")
	WebElement forgotpasswordlink;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signupbtn;
	
	public static @FindBy(xpath="//div[text()='Something went wrong...']")
	WebElement invaliduser;
	
	
	
	
	//Actions
	
	public String gettingLoignPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage correctLoginUser(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return  new  HomePage();
	}
	
	public LoginPage inCorrectUserNameLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new LoginPage();
	}
	
	public LoginPage inCorrectPasswordNameLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new LoginPage();
	}
	
	
	public SignUpPage clickOnSignUpPage() {
		signupbtn.click();
		return new SignUpPage();
	}
	
	

}
