package com.gill.gmailAccountTest.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

	protected WebDriver driver;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement waitForElementToVisible(WebElement element,
			int maxTime) {		
		
		WebDriverWait wait =  new WebDriverWait(driver, maxTime);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public Alert waitForAlertMessage(Alert alert,
			int maxTime) {		
		
		WebDriverWait wait =  new WebDriverWait(driver, maxTime);
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}

	public HomePage nevigateToGoogle() {
		driver.navigate().to("https://www.google.co.uk/");
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	public <T> T  getPage( Class<T> classs) {
		return PageFactory.initElements(driver, classs);
	}

}
