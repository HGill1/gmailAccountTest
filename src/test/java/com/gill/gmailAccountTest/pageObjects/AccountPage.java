package com.gill.gmailAccountTest.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage extends AbstractPage {
	
	@FindBy(name = "FirstName")
	private WebElement firstName;
	
	@FindBy(name = "LastName")
	private WebElement lastName;
	
	@FindBy(name = "GmailAddress")
	private WebElement username;
	
	@FindBy(name = "Passwd")
	private WebElement password;
	
	@FindBy(name = "PasswdAgain")
	private WebElement confirmPassword;
	
	@FindBy(name = "BirthMonth")
	private WebElement birthMonth;
	
	@FindBy(name = "BirthDay")
	private WebElement birthDay;
	
	@FindBy(name = "BirthYear")
	private WebElement birthYear;	
	
	@FindBy(name = "Gender")
	private WebElement gender;
	
	@FindBy(name = "RecoveryPhoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(name = "SkipCaptcha")
	private WebElement skipCaptcha;
	
	@FindBy(name = "TermsOfService")
	private WebElement termsOfService;
	
	@FindBy(name = "submitbutton")
	private WebElement submitButton;
	
	@FindBy(id = "errormsg_0_GmailAddress")
	private WebElement errmsgUsername;

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
		return getPage(AccountPage.class);

	}

	
	
	public AccountPage clickNextButton() {
		
		submitButton.click();		
		return getPage(AccountPage.class);	
	}
	
	public String verifyUsernameErrorMessage(){
		return errmsgUsername.getText();
	}

}
