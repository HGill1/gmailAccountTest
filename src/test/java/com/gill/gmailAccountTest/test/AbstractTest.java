package com.gill.gmailAccountTest.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gill.gmailAccountTest.pageObjects.HomePage;

public class AbstractTest {
	protected WebDriver driver;
	protected HomePage onHomePage;

	@Before
	public void testSet(){
		driver =  new FirefoxDriver();
		onHomePage = new HomePage(driver);
	}
	
	@After
	public void shutDown(){
		driver.close();
	}

}
