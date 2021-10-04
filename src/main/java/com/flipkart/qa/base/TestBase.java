package com.flipkart.qa.base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flipkart.qa.util.Timevalue;

public class TestBase {
	public static WebDriver driver;
	static Properties prop;

	public TestBase()  {
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream(
					"C://Users//akhil.kumar//workspace//NaveenMavenAutomation//src//main//java//com//flipkart//qa//config//config.properties");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void driverIntialize() {
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("launchurl");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Timevalue.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Timevalue.implicit_wait, TimeUnit.SECONDS);
		driver.get(url);

	}
}
