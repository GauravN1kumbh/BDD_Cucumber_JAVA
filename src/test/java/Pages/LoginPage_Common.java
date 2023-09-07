package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Common {

	WebDriver driver;

	By txt_username = By.name("username");
	By txt_password = By.name("password");
	By btn_submit = By.id("submit");

	public LoginPage_Common(WebDriver driver) {

		this.driver = driver;
	}

	public void enter_username(String username) {

		driver.findElement(txt_username).sendKeys(username);

	}

	public void enter_password(String password) {
		driver.findElement(txt_password).sendKeys(password);		
	}
	
	public void submit_btn() {
		driver.findElement(btn_submit).click();
		
	}

	public void verify_new_page() {
		
		if(!driver.getPageSource().contains("Congratulations student. You successfully logged in!")) {
			throw new IllegalStateException("User not loggedin Successfully - Please verify credentials");
		}

	}
}
