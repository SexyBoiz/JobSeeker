package moduleName;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCaseName {
	@Test
	public void testCaseName() {
		WebDriverManager.firefoxdriver().setup();
		new FirefoxDriver();
	}
}
