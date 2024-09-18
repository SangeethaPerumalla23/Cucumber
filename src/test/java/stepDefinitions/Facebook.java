package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Facebook {
WebDriver driver;

	@Given("Useer Navigate to the login page")
	public void useer_navigate_to_the_login_page() {
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
  @When("User Enter the valid crediential")
	public void user_enter_the_valid_crediential() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sangeethaperumalla2018@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("geetha@123");
		}

	@Then("I should be logged in succesfully")
	public void i_should_be_logged_in_succesfully() {
		
	driver.findElement(By.name("login")).click();	
	   
	}
}

