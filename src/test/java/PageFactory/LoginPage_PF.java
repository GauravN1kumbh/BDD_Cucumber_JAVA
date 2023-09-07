package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id="username")
	WebElement txt_username_PF;
	
	@FindBy(id="password")
	WebElement txt_Password_PF;
	
	@FindBy(id="submit")
	WebElement submit_btn_PF;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void input_username_pf(String username) {
		txt_username_PF.sendKeys(username);
		
	}
	
	public void input_password_pf( String password) {
		txt_Password_PF.sendKeys(password);
		
	}
	
	
	public void click_submit_bt_pf() {
		submit_btn_PF.click();
		
	}
	

	
	

}
