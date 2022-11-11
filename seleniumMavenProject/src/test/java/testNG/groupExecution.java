package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
//make group of test cases depends on the type of testing you are gonna do
public class groupExecution {
	@Test(groups = "Smoke")
	public void login() {
		
		System.out.println("Login Flipkart");
	}
	@Test(groups = "Regression")
	public void search() {
		System.out.println("Search product");
	}
	@Test(groups = "Regression")
	public void select() {
		System.out.println("select  product");
	}
	@Test(groups = "Regression")
	public void addCart() {
		System.out.println("added product to cart");
	}
	@Test(groups = "Smoke")
	public void payment() {
		System.out.println("payment is successful");
	}
}
