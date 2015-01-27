package com.gill.gmailAccountTest.util;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TestManager extends TestUtil {
	
	
	
	
	public static WebElement waitForElement(WebElement element) {	
		
		try{
			element = SelectBrowser.driverWait.until(ExpectedConditions.visibilityOf(element));						
		} catch(StaleElementReferenceException sle){
			System.out.println("The element is not attached to the DOM");
			element = null;
		}
		catch(ElementNotVisibleException env){
			System.out.println("The element is not Visible");
			element = null;
		}		
		catch(NoSuchElementException nse){
			System.out.println("There is no such element");
			element = null;
		}				
		return element;
	}
	

}
