package com.flipkart.qa.pages;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Obejct repository or page Factory
	@FindBy(id = "ap_email")
	WebElement username_field;

	@FindBy(xpath = "//div[contains(@id,'legalTextRow')]/a")
	WebElement conditions_text;

	@FindBy(xpath = "//div[contains(@id,'legalTextRow')]/a[2]")
	WebElement privacy_text;

	@FindBy(xpath = "//div[contains(@class,'a-section a-padding-medium auth-workflow')]/div[1]/div/a/i[1]")
	WebElement logo;

	@FindBy(id = "continue")
	WebElement signin_btn;

	// Intalizing my page objects

	public LoginPage() {
		PageFactory.initElements(driver, LoginPage.class);

	}

	// Actions :
	public static String checkTitle() {
		return driver.getTitle();
	}
	 

	public boolean checklogo() {
		return logo.isDisplayed();

	}

	public boolean privactext() {
		return privacy_text.isDisplayed();
	}
    
}
