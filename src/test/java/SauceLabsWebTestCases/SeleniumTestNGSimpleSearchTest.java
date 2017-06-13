package SauceLabsWebTestCases;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestNGSimpleSearchTest {
	public static final String USERNAME = "YOUR_USER_NAME";
	public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	public WebDriver driver;

	@BeforeClass
	public void initDriver() throws Exception {
		System.out.println("You are testing in chrome");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "58.0");
		driver = new RemoteWebDriver(new URL(URL), caps);
	}

	@Test
	public void searchInGoogle() throws InterruptedException {
		System.out.println("Search Omniwyse Technologies in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter Omniwyse technologies");
		element.sendKeys("Omniwyse technologies");
		System.out.println("submit");
		element.submit();
		System.out.println("Got Omniwyse technologies results");
		TimeUnit.SECONDS.sleep(5);
	}

	@AfterClass
	public void quitDriver() throws Exception {
		driver.quit();
	}
}
