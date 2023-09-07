package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page_PF {
	
	@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")
	WebElement btn_logout;
	

	WebDriver driver;
	
	public Logout_page_PF(WebDriver driver) {
		this.driver  = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
    public void validate_new_page_pf() {
        driver.getPageSource().contains("Congratulations student. You successfully logged in!");
  		
  	}
    
    public void click_logout_btn_pf() {
    	btn_logout.click();
		
	}
	
}


