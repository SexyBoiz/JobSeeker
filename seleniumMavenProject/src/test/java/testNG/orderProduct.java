package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class orderProduct {
	@Test(priority = 1)
	public void login() {
		Assert.fail();
		System.out.println("Login Flipkart");
	}
	@Test(priority = 2)
	public void search() {
		System.out.println("Search product");
	}
	@Test(priority = 3)
	public void select() {
		System.out.println("select  product");
	}
	@Test(dependsOnMethods = {"login","login"})//u can add more then one dependency
	public void addCart() {
		System.out.println("added product to cart");
	}
	@Test(dependsOnMethods = "addCart")
	public void payment() {
		System.out.println("payment is successful");
	}
}
