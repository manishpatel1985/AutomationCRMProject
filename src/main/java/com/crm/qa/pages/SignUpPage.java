package com.crm.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
		boolean reglable = reglabel.isDisplayed();
		Assert.assertTrue(reglable);
	}
	
	@FindBy(xpath="//h2[text()='Register']")
	WebElement reglabel;
	
	

	

}
