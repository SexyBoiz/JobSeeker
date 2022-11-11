package pomRepo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
		@Test
		public void loginPage(WebDriver driver)
		{
			driver.get("https://demo.actitime.com/login.do");
		}
	
}
