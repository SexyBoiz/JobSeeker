package moduleName;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Database Connection has been Established");
	}
	@BeforeSuite
	public void bcConfig() {
		System.out.println("The Browser has been launched");
		System.out.println("Navigated to the URL");
	}
	@BeforeSuite
	public void bmConfig() {
		System.out.println("Logged in to the Application");
	}
	@AfterMethod
	public void amConfig() {
		System.out.println("Logged out to the Application");
	}
	@AfterClass
	public void acConfig() {
		System.out.println("Browser has been closed");
	}
	
	
}
