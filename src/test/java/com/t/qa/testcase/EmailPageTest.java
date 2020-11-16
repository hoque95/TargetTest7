package com.t.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.t.qa.base.TestBase;
import com.t.qa.pages.EmailPage;
import com.t.qa.pages.HomePage;
import com.t.qa.utils.TestUtils;

public class EmailPageTest extends TestBase {
	HomePage homePage;
	EmailPage emailPage;
	TestUtils testUtils;
	public EmailPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		testUtils =new TestUtils();
		emailPage=homePage.clickEmailBtn();
	}
	
	
	@Test
	public void signUpEmailTest() throws InterruptedException {
		Thread.sleep(6000);
		testUtils.frameSwitch();
		emailPage.emailSignUp();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void printTitleTest() {
		String title=emailPage.emailPageTitel();
     System.out.println("Email Page Title ::-->"+title);
	 
	}
	
	@Test
	public void emailPageTitleTest() {
		String title=emailPage.emailPageTitel();
		Assert.assertEquals(title, "Email Sign-Up : Target");
	}
	
	
	
   @AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
