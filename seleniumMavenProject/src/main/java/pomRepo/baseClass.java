package pomRepo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	//Pre condition annotation start with ---   @Before
	@BeforeSuite
	public void setup()
	{
		System.out.println("setup system property for firefox");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch empty browser");
		//WebDriverManager.firefoxdriver().setup();
	}
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enter URL");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("login method");
	}
	//Test Cases starting with -- @Test
	@Test
	public void gogletitletest() {
		System.out.println("google title test");
	}
	//post conditions starting with--    @After
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	@AfterTest
	public void deleteCokies() {
		System.out.println("delete cookies");
	}
	@AfterClass
	public void closeBroser()
	{
		System.out.println("closing browser");
	}
	@AfterSuite
	public void genrateTestReport()
	{
		System.out.println("genrate Test Report");
	}
}
