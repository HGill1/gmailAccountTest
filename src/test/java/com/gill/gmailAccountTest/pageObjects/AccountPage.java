package com.gill.gmailAccountTest.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage extends AbstractPage {
	
	@FindBy(name = "FirstName")
	WebElement firstName;
	
	@FindBy(name = "LastName")
	WebElement lastName;
	
	@FindBy(name = "GmailAddress")
	WebElement username;
	
	@FindBy(name = "Passwd")
	WebElement password;
	
	@FindBy(name = "PasswdAgain")
	WebElement confirmPassword;
	
	@FindBy(name = "BirthMonth")
	WebElement birthMonth;
	
	@FindBy(name = "BirthDay")
	WebElement birthDay;
	
	@FindBy(name = "BirthYear")
	WebElement birthYear;	
	
	@FindBy(name = "Gender")
	WebElement gender;
	
	@FindBy(name = "RecoveryPhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(name = "SkipCaptcha")
	WebElement skipCaptcha;
	
	@FindBy(name = "TermsOfService")
	WebElement termsOfService;
	
	@FindBy(name = "submitbutton")
	WebElement submitButton;
	
	@FindBy(id = "errormsg_0_GmailAddress")
	WebElement errmsgUsername;

	public AccountPage(WebDriver driver) {

		super(driver);
	}

	public AccountPage fillFormWithData() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		firstName.sendKeys("test name");
		lastName.sendKeys("test lastname");
		password.sendKeys("Pa55w0Rdg");
		confirmPassword.sendKeys("Pa55w0Rdg");
		js.executeScript("document.querySelector(\"input[name$='BirthMonth']\").value = '07';");
		birthDay.sendKeys("10");
		birthYear.sendKeys("1982");
		js.executeScript("document.querySelector(\"input[name$='Gender']\").value = 'MALE';");
		phoneNumber.sendKeys("7574535779");
		skipCaptcha.click();
		termsOfService.click();
		return PageFactory.initElements(driver, AccountPage.class);

	}
	
	public AccountPage clickNextButton() {
		
		submitButton.click();		
		return PageFactory.initElements(driver, AccountPage.class);		
	}
	
	public String verifyUsernameErrorMessage(){
		return errmsgUsername.getText();
	}

}
