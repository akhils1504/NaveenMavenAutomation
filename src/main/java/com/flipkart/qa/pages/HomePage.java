package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@id='nav-signin-tooltip']/a/span")
	WebElement Signin_btn;

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	WebElement amazon_logo;

	// intializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String pageTitle() {
		return driver.getTitle();
	}

	public boolean checklogo() {
		return amazon_logo.isDisplayed();
	}

	public SignUpPage Sigin() {
		while (Signin_btn.isDisplayed()) {
			Signin_btn.click();
		}
		return new SignUpPage();
	}

}
