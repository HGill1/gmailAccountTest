package com.gill.gmailAccountTest.test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gill.gmailAccountTest.pageObjects.HomePage;
import com.gill.gmailAccountTest.util.SelectBrowser;

public class AbstractTest {
	protected WebDriver driver;
	protected HomePage onHomePage;

	@Before
	public void testSet() throws IOException{
		//driver =  new FirefoxDriver();
		driver = SelectBrowser.getDriver();
		onHomePage = new HomePage(driver);
	}
	
	@After
	public void shutDown(){
		driver.close();
	}

}
