package com.gill.gmailAccountTest.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.gill.gmailAccountTest.pageObjects.AccountPage;
import com.gill.gmailAccountTest.pageObjects.LoginPage;

public class UserErrorMessageTest extends AbstractTest {

	@Before
	public void testSetUP() {
		onHomePage = onHomePage.nevigateToGoogle();
	}

	@Test
	public void shouldValidateUsername() {
		LoginPage onLoginPage = onHomePage.clickGmailLink();
		AccountPage onAccountPage = onLoginPage.clickOnCreateAccountLink();
		String userErrorText = onAccountPage
				.fillFormWithData()
				.clickNextButton()
				.verifyUsernameErrorMessage();

		assertEquals(userErrorText, "You can't leave this empty.");

	}

}
