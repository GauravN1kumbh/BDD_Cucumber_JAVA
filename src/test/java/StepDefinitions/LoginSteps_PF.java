package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPage_PF;
import PageFactory.Logout_page_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_PF {
	

	WebDriver driver = null;
	LoginPage_PF lpf;
	Logout_page_PF lof;
	
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
	    lpf = new LoginPage_PF(driver);

	    lpf.input_username_pf(username);
	    lpf.input_password_pf(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside And Block");
       
		lpf.click_submit_bt_pf();

	}

	@Then("the user navigated to home page")
	public void the_user_navigated_to_home_page() {
		System.out.print("Inside Then Block");
		
		lof = new Logout_page_PF(driver);

		lof.validate_new_page_pf();
		lof.click_logout_btn_pf();
		driver.close();

	}

}
