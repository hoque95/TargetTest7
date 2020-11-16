package com.t.qa.pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.t.qa.base.TestBase;

public class HomePage extends TestBase{

	// 1. Page Factory, Or Object Repo 
	
	
	@FindBy(xpath ="//div[@id='select-50']")
	WebElement moreBtn;
	
	@FindBy(xpath = "//div[@class='OptionLabel-u6t284-0 hyvKDB h-text-md' and text()='Emails']")
	WebElement emailBtn;
	
	
	// 2.Initialization of the page Objects
	
	public HomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	// 3. Actions
	
	public String pageTitle() {
		return driver.getTitle();
		
	}
	
	public EmailPage clickEmailBtn() {
		moreBtn.click();
		emailBtn.click();
		return new EmailPage();
	}
	

	
	
	
	
}
