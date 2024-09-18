package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	WebDriver driver;
	@Given("Navigate to Swag labs login page")
	public void navigate_to_swag_labs_login_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	
	}

	@When("Iuser enter valid credentials")
	public void iuser_enter_valid_credentials() {
	   
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	WebElement ele = driver.findElement(By.xpath("//span[text()='Products']"));
	
	boolean status = ele.isDisplayed();
	System.out.println(status);
	Assert.assertTrue(status);
		
	
	}

}
