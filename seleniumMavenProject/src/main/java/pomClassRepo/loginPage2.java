package pomClassRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory
public class loginPage2 {
	WebDriver driver;
	loginPage2(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);//this method will create web element
	}
	//identify Web Element
	@FindBy(id="user-name")WebElement username;
	
	@FindBy(id="password")WebElement password;
	
	@FindBy(id="login-button")WebElement loginBtn;
	
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLoginbutton()
	{
		loginBtn.click();
	}
}
