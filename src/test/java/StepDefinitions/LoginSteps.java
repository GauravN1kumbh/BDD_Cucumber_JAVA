package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
	    System.out.println("Inside Given Block");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
	    System.out.println("Inside When Block");
	    //throw new io.cucumber.java.PendingException();
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside And Block");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the user navigated to home page")
	public void the_user_navigated_to_home_page() {
		System.out.print("Inside Then Block");
	    //throw new io.cucumber.java.PendingException();
	}

}
