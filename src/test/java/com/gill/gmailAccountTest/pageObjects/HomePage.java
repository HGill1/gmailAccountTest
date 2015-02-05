package com.gill.gmailAccountTest.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {
	
	@FindBy(linkText = "Gmail")
	private WebElement gmailLink;
	
	public static final Logger logger = Logger.getLogger(HomePage.class);
	
	public HomePage(WebDriver driver){
		
		super(driver);
	}
	
	public LoginPage clickGmailLink(){
		gmailLink.click();
		logger.info("gmail Link clicked");
		return PageFactory.initElements(driver, LoginPage.class);
		
	}

}
