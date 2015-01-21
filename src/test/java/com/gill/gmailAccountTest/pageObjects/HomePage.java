package com.gill.gmailAccountTest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {
	
	@FindBy(linkText = "Gmail")
	private WebElement gmailLink;
	
	public HomePage(WebDriver driver){
		
		super(driver);
	}
	
	public LoginPage clickGmailLink(){
		gmailLink.click();
		return PageFactory.initElements(driver, LoginPage.class);
		
	}

}
