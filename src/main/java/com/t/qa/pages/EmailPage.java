package com.t.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.t.qa.base.TestBase;

public class EmailPage extends TestBase{
	
	@FindBy(xpath="//input[@id='s_name_first']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='s_name_last']")
	WebElement lastName;
	@FindBy(xpath="//input[@id='s_email']")
	WebElement email;
	@FindBy(xpath="//input[@id='confirm_email']")
	WebElement verifyemail;
	@FindBy(xpath="//input[@type='submit']")
	WebElement signUp;
	
	
	public EmailPage() {
		PageFactory.initElements(driver, this);	
	}

	public String emailPageTitel() {
		return driver.getTitle();
	}
	
	public void emailSignUp() {
		
		firstName.sendKeys(prop.getProperty("fName"));
		lastName.sendKeys(prop.getProperty("lName"));
		email.sendKeys(prop.getProperty("eMail"));
		verifyemail.sendKeys(prop.getProperty("vEmail"));
		
		signUp.click();
	}
	
	
	
}
