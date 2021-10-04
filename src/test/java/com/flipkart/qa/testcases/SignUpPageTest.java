package com.flipkart.qa.testcases;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	SignUpPage page = new SignUpPage();

	@BeforeMethod
	public void setup() {
		driverIntialize();
		HomePage home = new HomePage();
		home.Sigin();

	}

	@Test
	public void signInText() {
		Assert.assertEquals(page.siginText(), "Sign-In");

	}
	@Test
	public void termsConditionText(){
		Assert.assertTrue(page.conditionText());
	}
	@Test
	public void privactText(){
		Assert.assertTrue(page.privacyText());
	}
	public void enterEmail(){
		page.email(prop.getProperty("username"));//////////////////////////////////////
		Assert.assertTrue(page.forget_pwd());
	}
	@Test
	public void signInTextSecondPage() {
		Assert.assertEquals(page.siginText(), "Sign-In");

	}
	public void Dashboard(){
		page.sign_In(prop.getProperty("password"));
	}

}
