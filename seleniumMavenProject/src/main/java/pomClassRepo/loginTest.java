package pomClassRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//create object of loginpage
		loginPage Loginpg=new loginPage(driver);
		
		//open URL
		driver.get("https://www.saucedemo.com/");
		Loginpg.enterusername("standard_user");
		Loginpg.enterPassword("secret_sauce");
		Loginpg.clickLoginbutton();
	}
}
