package pomClassRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//create object of loginpage
		loginPage2 Loginpg=new loginPage2(driver);
		
		//open URL
		driver.get("https://www.saucedemo.com/");
		Loginpg.enterUsername("standard_user");
		Loginpg.enterPassword("secret_sauce");
		Loginpg.clickLoginbutton();	}
}


