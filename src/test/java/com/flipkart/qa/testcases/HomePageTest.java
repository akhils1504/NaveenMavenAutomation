package com.flipkart.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.SignUpPage;

public class HomePageTest extends TestBase {
	HomePage home;
	SignUpPage signUp;

	public HomePageTest() {
		super();
		home = new HomePage();
	}

	@BeforeMethod
	public void setup() {
		driverIntialize();
		// create object of homepage
		// home = new HomePage();

	}

	@Test(priority = 1)
	public void title() {
		String title = home.pageTitle();
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Assert.assertTrue(title.contains("Amazon"));
	}

	@Test(priority = 2)
	public void checklogo() {
		boolean flag = home.checklogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void login() {
		signUp = home.Sigin();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
//
//@BeforeSuite
//@BeforeTest
//@BeforeClass
//@BeforeMethod
//@Test
//@AfterMethod
//@AfterClass
//@AfterTest
//@AfterSuite				

