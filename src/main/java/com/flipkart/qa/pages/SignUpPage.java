package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.qa.base.TestBase;

public class SignUpPage extends TestBase {
	@FindBy(xpath = "//input[@type='email']")
	WebElement email_id;
	
	@FindBy(xpath="//h1[contains(text(),'Sign-In')]")
	WebElement Signin_text;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement continue_btn;

	@FindBy(xpath = "//div[@id=legalTextRow']/a[1]")
	WebElement condition_text;

	@FindBy(xpath = "//div[@id='legalTextRow']/a[2]")
	WebElement privcay_text;
	
	@FindBy(xpath="//div[@class='a-row a-spacing-base']/span")
	WebElement email_id_displayed;
	
	@FindBy(id="ap_password")
	WebElement pass;
	
	@FindBy(id="auth-signin-button")
	WebElement sigin_btn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password')]")
	WebElement forgetpwd;
	
	public boolean siginText(){
		return Signin_text.isDisplayed();
		
	}
	
	public boolean conditionText() {
		return condition_text.isDisplayed();
	}

	public boolean privacyText() {
		return privcay_text.isDisplayed();

	}

	public void email(String email) {

		email_id.sendKeys("email");
		continue_btn.click();
	}
	
	public String email_id_dis{
		return email_id_displayed.getText();//////////////////////////////
		
	}
	
	public boolean forget_pwd(){
		return forgetpwd.isDisplayed()
	}
	public Dashboard sign_In(String password){
		pass.sendKeys(password);
		sigin_btn.click();
		return Dashboard();/////////////////////////////////////////
	}
	

}
