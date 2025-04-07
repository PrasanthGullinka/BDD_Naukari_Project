package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
  WebDriver driver;
	
	
	@Given("User navigates to login page")
	public void User_navigates_to_login_page(){
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	}
	@When("User has entered valid email address {string} into the email field")
	public void user_has_entered_valid_email_address_into_the_email_field(String EmailTxt) {
	    
		driver.findElement(By.id("input-email")).sendKeys("prasanthgullinka@gmail.com");
	}

	@And("User has entered valid passowrd {string} into password field")
	public void user_has_entered_valid_passowrd_into_password_field(String PasswordTxt) {
	    
		driver.findElement(By.id("input-password")).sendKeys("12345");	
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();   
	}

	@Then("User gets successful logged in")
	public void user_gets_successful_logged_in() {
		Assert.assertTrue(driver.findElement(By.xpath(" //h2[normalize-space()='My Account']")).isDisplayed());
	}

	@When("User enters invalid email address {string} into email field")
	public void user_enters_invalid_email_address_into_email_field(String InvalidEmailtxt) {
	  driver.findElement(By.id("input-email")).sendKeys("prasanthgull@gmail.com");
	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String string) {
		driver.findElement(By.id("input-password")).sendKeys("123454567");	
	  
	}

	@Then("User should get proper Warning message")
	public void user_should_get_proper_warning_message() {
	 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed());
	}

	@When("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@When("User enters valid email address {string} into the email field")
	public void user_enters_valid_email_address__into_the_email_field(String Emailtxt) {
	   
		driver.findElement(By.id("input-email")).sendKeys("prasanthgullinka@gmail.com");
	}

	@When("User has entered invalid passowrd {string} into password field")
	public void user_has_entered_invalid_passowrd_into_password_field(String InvalidPasswordtxt) {
		driver.findElement(By.id("input-password")).sendKeys("123454567");	
	}


	@When("User dont enter email address")
	public void user_dont_enter_email_address() {
		driver.findElement(By.id("input-email")).sendKeys("");
	}

	@When("User dont enter email password")
	public void user_dont_enter_email_password() {
		driver.findElement(By.id("input-password")).sendKeys("");	
	}
}
