package com.pftc.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFormStepDef {

	WebDriver driver;
	
	@Given("user Navigate to Selenium Easy Home Page")
	public void user_navigate_to_selenium_easy_home_page() {
	   System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.seleniumeasy.com/test/");
	}

	@When("user click on Input Form Drop Down")
	public void user_click_on_input_form_drop_down() {
	   

	}

	@Then("user click on Simple Form Demo Link")
	public void user_click_on_simple_form_demo_link() {
	    

	}

	@Then("user Enter Message on the Message Field")
	public void user_enter_message_on_the_message_field() {
	   

	}

	@Then("user click on show message button")
	public void user_click_on_show_message_button() {
	    

	}

	@Then("user verify that message was displyed")
	public void user_verify_that_message_was_displyed() {
	   

	}

	@Then("user enter value for a")
	public void user_enter_value_for_a() {
	    
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
