package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	WebDriver driver;
	
	@Given("User navigates to Home page")
	public void user_navigates_to_home_page() {
		driver= DriverFactory.getDriver();
	   
	}

	@When("User has entered valid product {string} into the search box field")
	public void user_has_entered_valid_product_into_the_search_box_field(String string) {
	    driver.findElement(By.name("search")).sendKeys("HP");
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	   driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
	}

	@Then("User should get valid product displayed in search results.")
	public void user_should_get_valid_product_displayed_in_search_results() {
	  Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='HP LP3065']")).isDisplayed());
	}

	@When("User has entered invalid product {string} into the search box field")
	public void user_has_entered_invalid_product_into_the_search_box_field(String string) {
		
		   driver.findElement(By.name("search")).sendKeys("Honda");
			}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	  
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]")).isDisplayed());

	}

	@When("User dont entered any product into the search box field")
	public void user_dont_entered_any_product_into_the_search_box_field() {
		driver.findElement(By.name("search")).sendKeys("");
	}

}
