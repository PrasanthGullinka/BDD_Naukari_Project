package StepDefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.datatable.DataTable;				
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
		WebDriver driver;
		
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		driver= DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@When("User has enters the details into below fields")
	public void user_has_enters_the_details_into_below_fields(DataTable dataTable) {
		
		Map<String,String>dataMap=dataTable.asMap(String.class,String.class);
	   driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("first Name"));
	   driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("last Name"));
	   driver.findElement(By.id("input-email")).sendKeys(dataMap.get("Email"));
	   driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
	   driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
	   driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("password")); 
	}

	@When("User selects Privacy Policy checkbox")
	public void user_selects_privacy_policy_checkbox() {
	    driver.findElement(By.name("agree"));
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		 driver.findElement(By.xpath("//input[@value='agree']"));
	}

	@Then("User Account gets created successfully")
	public void user_account_gets_created_successfully() {
	   Assert.assertEquals("Your Account Has Been Created!",driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
	}

	@When("User selects Yes for News paper")
	public void user_selects_yes_for_news_paper() {
	  driver.findElement(By.xpath("//input[@type='newsletter']")).click();
	}


	@Then("User Should gets proper warning message")
	public void user_should_gets_proper_warning_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: E-Mail Address is already registered!"));
	}

	@When("User has dont enters any details into fields")
	public void user_has_dont_enters_any_details_into_fields() {
	   
	}
	@Then("User Should gets proper warning message for every mandatory field")
	public void User_Should_gets_proper_warning_message_for_every_mandatory_field() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: You must agree to the Privacy Policy!"));
		Assert.assertEquals("First Name must be between 1 and 32 characters!",driver.findElement(By.xpath("//input[@name='firstname']/following-sibling::div")).getText());
		Assert.assertEquals("Last Name must be between 1 and 32 characters!",driver.findElement(By.xpath("//input[@name='lastname']/following-sibling::div")).getText());
		Assert.assertEquals("E-Mail Address does not appear to be valid!",driver.findElement(By.xpath("//input[@name='email']/following-sibling::div")).getText());
		Assert.assertEquals("Telephone must be between 3 and 32 characters!",driver.findElement(By.xpath("//input[@name='telephone']/following-sibling::div")).getText());
		Assert.assertEquals("Password must be between 4 and 20 characters!",driver.findElement(By.xpath("//input[@name='password']/following-sibling::div")).getText());
		
	}

}
