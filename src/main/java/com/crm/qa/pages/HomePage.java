package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//div[@class='header item']")
	WebElement cogmentologo;
	
	@FindBy(xpath="//span[text()='Calendar']")
	WebElement calendarlink;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactslink;
	
	@FindBy(xpath="//span[text()='Deals']")
	WebElement dealslink;
	
	@FindBy(xpath="//span[text()='Tasks']")
	WebElement taskslink;
	
	@FindBy(xpath="//span[text()='Cases']")
	WebElement caselink;
	
	@FindBy(xpath="//span[text()='Companies']")
	WebElement compnieslink;
	
	@FindBy(xpath="//span[text()='Calls']")
	WebElement callslink;
	
	@FindBy(xpath="//span[text()='Documents']")
	WebElement documetnslink;
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement emaillink;
	
	@FindBy(xpath="//span[text()='Campaigns']")
	WebElement campaignslink;
	
	@FindBy(xpath="//span[text()='Forms']")
	WebElement formslink;
	
	
	
	public HomePage() {
	PageFactory.initElements(driver, this);
	boolean logo=cogmentologo.isDisplayed();
	Assert.assertTrue(logo);
	}
	
	public CalenderPage clickOnCalenderLink() {
		calendarlink.click();
		return new CalenderPage();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactslink.click();
		return new ContactsPage();
		
	}
	public CompaniesPage clickOnCompniesLink() {
		compnieslink.click();
		return new CompaniesPage();
		
	}
	
	public DealsPage clickOnDealsLink() {
		dealslink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		taskslink.click();
		return new TasksPage();
		
	}
	
	public CasesPage clickOnCasesLink() {
		caselink.click();
		return new CasesPage();
	}
	
	public CallsPage clickOnCallsLink() {
		callslink.click();
		return new CallsPage();
		
	}
	
	public DocumentsPage clickOnDocumentsLinkPage() {
		documetnslink.click();
		return new DocumentsPage();
		
	}
	
	public EmailPage clickOnEmailLinkPage() {
		emaillink.click();
		return new EmailPage();
		
	}
	
	public CampaignsPage clickOnCampaignLinkPage() {
		campaignslink.click();
		return new CampaignsPage();
	}

	public FormsPage clickOnFormsPage() {
		formslink.click();
		return new FormsPage();
		
	}
	


	
	
	

}
