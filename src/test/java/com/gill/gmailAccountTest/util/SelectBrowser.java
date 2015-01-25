package com.gill.gmailAccountTest.util;

import java.util.concurrent.TimeUnit;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SelectBrowser {

	protected static WebDriver driver;

	public SelectBrowser() {
		// TODO Auto-generated constructor stub
	}

	public static WebDriver getDriver() {

		if (driver == null) {
			String browser = ReadConfigFile.getBrowser();

			switch (browser) {
			case "1":
				 driver = new FirefoxDriver();
				break;
				
			case "2":
				 driver = getChromeDriver();
				break;
				
			case "3":
				 driver = new HtmlUnitDriver();
				break;
				
			case "4":
				 driver = getIEDriver();
				break;

			default:
				break;
			}
		}
		
		return driver;

	}

	private static WebDriver getChromeDriver() {

		String chromeDriverPath =  ReadConfigFile.getChromeDriver();
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
