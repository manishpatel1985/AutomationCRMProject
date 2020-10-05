package com.crm.qa.testscases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.CallsPage;
import com.crm.qa.pages.CampaignsPage;
import com.crm.qa.pages.CasesPage;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.DocumentsPage;
import com.crm.qa.pages.EmailPage;
import com.crm.qa.pages.FormsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.pages.TasksPage;

import net.bytebuddy.implementation.bind.annotation.Super;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage  homepage;
	SignUpPage signUpPage;
	CalenderPage calenderPage;
	CompaniesPage companiesPage;
	DealsPage dealsPage;
	TasksPage tasksPage;
	CasesPage casesPage;
	CallsPage callsPage;
	DocumentsPage documentsPage;
	EmailPage emailPage;
	CampaignsPage campaignsPage;
	FormsPage formsPage;
	ContactsPage contactsPage;
	
	
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage =loginpage.correctLoginUser(prop.getProperty("username"), prop.getProperty("password"));
		 
	}
		
	

	
	@Test(priority=1,enabled=false)
	public void clickOnCalenderLinkTest() throws InterruptedException {
	calenderPage= homepage.clickOnCalenderLink();
	Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void clickOnContactsLinkTest() throws InterruptedException {
	contactsPage=homepage.clickOnContactsLink();
	Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void clickOnCompniesLinkTest() {
	  companiesPage= homepage.clickOnCompniesLink();
	}
	
	@Test(priority=4)
	public void clickOnDealsLinkTest() {
		dealsPage = homepage.clickOnDealsLink();
	}
	
	@Test(priority=5)
	public void clickOnTasksLinkTest() {
		tasksPage = homepage.clickOnTasksLink();
	}
	
	@Test(priority=6)
	public void clickOnCasesLinkTest() {
	casesPage=homepage.clickOnCasesLink();
	}
	
	@Test(priority=7)
	public void clickOnCallsLinkTest() {
	callsPage=	homepage.clickOnCallsLink();
	}
	
	@Test(priority=8)
	public void clickOnDocumentsLinkPageTest() {
		documentsPage = homepage.clickOnDocumentsLinkPage();
	}
	
	
	@Test(priority=9)
	public void clickOnEmailLinkPageTest() {
	 emailPage= 	homepage.clickOnEmailLinkPage();
	}
	
	@Test(priority=10)
	public void clickOnCampaignLinkPageTest() {
	campaignsPage =	homepage.clickOnCampaignLinkPage();
	}
	
	@Test(priority=11)
	public void clickOnFormsPageLinkTest() {
		formsPage = homepage.clickOnFormsPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
