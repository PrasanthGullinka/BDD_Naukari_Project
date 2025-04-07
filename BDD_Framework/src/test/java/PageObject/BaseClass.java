package PageObject;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.DriverFactory;

public class BaseClass {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		DriverFactory.initializeBrowser("Chrome");
		driver = DriverFactory.getDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://tutorialsninja.com/demo/");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
