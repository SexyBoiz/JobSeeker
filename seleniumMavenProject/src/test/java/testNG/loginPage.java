package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver) {//this will load the @findBy annotation in constructor
		PageFactory.initElements(driver,this);
	}
	
		@FindBy(id="username")
		private WebElement usernameTextField;
		
		@FindBy(name="pwd")
		private WebElement passwordTextField;
		
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement LoginButton;

		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		}
		
		public void loginAction(String username, String password)
		{
			usernameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			LoginButton.click();
		}
}
