package com.crm.qa.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class TasksPage extends TestBase {
	
	public TasksPage() {
		PageFactory.initElements(driver, this);
		Assert.assertTrue(taskslable.isDisplayed());
	}

	@FindBy (xpath="//div[text()='Tasks']") 
	WebElement taskslable;
	
	@FindBy (xpath="//th[text()='Title']") 
	WebElement titlecheckbox;
	
	public boolean cliclOnTitleCheckBox() {
		titlecheckbox.click();
	return	titlecheckbox.isEnabled();
	}
	
	
	
	
	
	
	
	
	
	
	

}
