package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null;
	
	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
	    System.out.println("Inside Given Block");
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gani0320\\Desktop\\SDET\\BDD_Cucumber\\Cucumber_Artifacts\\src\\test\\resources\\Artifacts\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}

	@When("^the user enters the valid (.*) and (.*)$")
	public void the_user_enters_the_valid_username_and_password(String username, String password) {
	    System.out.println("Inside When Block");
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);

	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside And Block");
		driver.findElement(By.id("submit")).click();

	}

	@Then("the user navigated to home page")
	public void the_user_navigated_to_home_page() {
		System.out.print("Inside Then Block");
	    //throw new io.cucumber.java.PendingException();
		driver.getPageSource().contains("Congratulations student. You successfully logged in!");
		
		driver.close();

	}

}
