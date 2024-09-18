package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookMultiple {
	WebDriver driver = new ChromeDriver();
	
	@Before
	@Given("the user is the login page")
	public void the_user_is_the_login_page() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("the user enters user name\"{int}\" and passwordGeetha@{int}")
	public void the_user_enters_user_name_and_password_geetha(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be logged in successful")
	public void user_should_be_logged_in_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
