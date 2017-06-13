package sauceLabsWebTestCases;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumJunitSimpleSearchTest {
	public static final String USERNAME = "kmanohar";
	public static final String ACCESS_KEY = "938c90f5-5cd5-46ce-a9c8-0dcffb4669f9";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	public WebDriver driver;

	@Before
	public void initDriver() throws Exception {
		System.out.println("You are testing in chrome");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "58.0");
		driver = new RemoteWebDriver(new URL(URL), caps);
	}

	@Test
	public void searchInGoogle() {
		System.out.println("Search Omniwyse Technologies in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter Omniwyse technologies");
		element.sendKeys("Omniwyse technologies");
		System.out.println("submit");
		element.submit();
		System.out.println("Got Omniwyse technologies results");
	}

	@After
	public void quitDriver() throws Exception {
		driver.quit();
	}
}
