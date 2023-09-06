package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("the user is on chrome browser")
	public void the_user_is_on_chrome_browser() {
		System.out.println("Inside Block - the user is on chrome browser");
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gani0320\\Desktop\\SDET\\BDD_Cucumber\\Cucumber_Artifacts\\src\\test\\resources\\Artifacts\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	}

	@When("the user search for google page")
	public void the_user_search_for_google_page() {
		System.out.println("Inside Block - the user search for google page");
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
				
	}

	@When("the user enter some data to search bar")
	public void the_user_enter_some_data_to_search_bar() throws InterruptedException {
		System.out.println("Inside Block - the user enter some data to search bar");
		
		driver.findElement(By.name("q")).sendKeys("netcracker technology");;
		Thread.sleep(2000);
	}

	@And("the user hit enter")
	public void the_user_hit_enter() {
		System.out.println("Inside Block - the user hit enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	

	@Then("the user navigated to search result page")
	public void the_user_navigated_to_search_result_page() {
		System.out.println("Inside Block - the user navigated to search result page");
		driver.getPageSource().contains("Careers");
		driver.close();
		driver.quit();

	}

}
