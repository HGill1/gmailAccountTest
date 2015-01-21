package com.gill.gmailAccountTest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

	@FindBy(linkText = "Create an account")
	WebElement createAccountLink;

	public LoginPage(WebDriver driver) {

		super(driver);

	}

	public AccountPage clickOnCreateAccountLink() {
		createAccountLink.click();
		return PageFactory.initElements(driver, AccountPage.class);

	}

}
