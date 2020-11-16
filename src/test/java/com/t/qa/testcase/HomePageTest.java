package com.t.qa.testcase;




import org.testng.Assert;

import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.t.qa.base.TestBase;
import com.t.qa.pages.EmailPage;
import com.t.qa.pages.HomePage;



public class HomePageTest extends TestBase {

	HomePage homePage;
	EmailPage emailPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test
	public void PrintTitle() {
		String pt=homePage.pageTitle();
		System.out.println("Title of the page ::->"+pt);
	}
	
	@Test
	public void TitleValidation() {
    String pt=homePage.pageTitle();
	Assert.assertEquals(pt, "Target : Expect More. Pay Less.");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
