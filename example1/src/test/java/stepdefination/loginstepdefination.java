package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstepdefination {
	
	 ChromeDriver driver;
	@Given("browser to open")
	public void browser_to_open() {
	WebDriverManager.chromedriver().setup();
   driver =new ChromeDriver();
 
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	       driver.findElement(By.id("email")).sendKeys("sai");
	       driver.findElement(By.id("pass")).sendKeys("fluffy");
		
		
		
		
	}

	@And("hits login button")
	public void hits_login_button() {
	
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	
		
		
		
		
	}


	
}
