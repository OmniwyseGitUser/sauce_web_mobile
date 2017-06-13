package sauceLabsMobileTestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumJunitSimpleSearchTest {
	public static final String USERNAME = "YOUR_USERNAME";
	public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("app", "YOUR_APK_PATH");

		driver = new AndroidDriver<>(new URL(URL), capabilities);
	}

	@Test
	public void mobileTest() throws Exception {
		/**
		 * Write your testcase steps here.
		 */

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
