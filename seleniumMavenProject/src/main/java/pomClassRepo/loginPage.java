package pomClassRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;//to find web element create this webdriver object
	
	loginPage(WebDriver d)//WebDriver is initialized here in thi constructor
	{
		driver=d;
	}
	By username=By.id("user-name");
	By password=By.id("password");
	By loginBtn=By.id("login-button");
	
	public void enterusername(String uname)//element we have found to use them create a method
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLoginbutton()
	{
		driver.findElement(loginBtn).click();
	}
	
}
