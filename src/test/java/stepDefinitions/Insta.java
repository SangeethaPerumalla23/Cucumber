package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Insta {
	WebDriver driver;
	
	@Before("@smoke")
	public void beforeScenario() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login/");

	}
	@After
	public void afterScenario() {
		driver.quit();
	}
	
	@Given("user enter instavalid credentials")
	public void user_enter_instavalid_credentials() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sangeethaperumalla2018@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("geetha@123");
	}
	
	@Given("user enter instain-valid credentials")
	public void user_enter_instavalid_credential() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ganapathi");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("geetha@123");
	}
	

	@Then("click on instagram_signIn button")
	public void click_on_instagram_sign_in_button() {
		driver.findElement(By.name("login")).click();	
	}

}
