package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Initialization {
	
	public void browser_init() {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gani0320\\Desktop\\SDET\\BDD_Cucumber\\Cucumber_Artifacts\\src\\test\\resources\\Artifacts\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	

	
	
}
