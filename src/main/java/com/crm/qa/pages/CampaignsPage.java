package com.crm.qa.pages;
/*
 * Changes has been added
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class CampaignsPage extends TestBase {
	
	public CampaignsPage() {
	PageFactory.initElements(driver, this);
	Assert.assertTrue(campaignslabel.isDisplayed());
	}
	
	@FindBy (xpath="//div[text()='Campaigns']") 
	WebElement campaignslabel;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newbutton;
	
	@FindBy(xpath="//div[@class='ui fluid container']//div[@class='ui navbar fixed main menu']")
	WebElement newcampaignlabel;
	
	@FindBy(name="name")
	WebElement nameinput;
	
	
	
	public boolean clickOnNewButton() {
		newbutton.click();
		return newcampaignlabel.isEnabled();
	}
	
	

}
