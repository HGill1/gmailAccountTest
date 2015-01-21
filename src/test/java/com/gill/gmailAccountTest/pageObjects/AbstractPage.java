package com.gill.gmailAccountTest.pageObjects;

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

	public WebElement waitForPageToLoad(WebElement element,
			int maxTime) {

		return (new WebDriverWait(driver, maxTime)).until(ExpectedConditions
			.visibilityOf(element));

	}

	public HomePage nevigateToGoogle() {
		driver.navigate().to("https://www.google.co.uk/");
		return PageFactory.initElements(driver, HomePage.class);
	}

}
