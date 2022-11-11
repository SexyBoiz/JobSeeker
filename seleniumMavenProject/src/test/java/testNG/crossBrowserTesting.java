package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	WebDriver driver;
	@Parameters("browser")//put this after converting to testNG
	@Test
	public void demo(String browser)
	{
		System.setProperty("webdriver.chrome.driver;","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver;","./driver/geckodriver.exe");
		
	if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
	if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/login/");
	}
	
}
