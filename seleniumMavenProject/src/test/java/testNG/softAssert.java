package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void demo() {
		boolean actualResult = true;
		boolean expectedResult = false;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		System.out.println("boolean Assertion has passed");
		 sa.assertAll();//this is the checkpoint in case u use it. if its not use then cases will be passed.
	}
	@Test
	public void demo1() {
		int actualResult = 69;
		int expectedResult = 69;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		System.out.println("int Assertion has passed");
		 sa.assertAll();//this is the checkpoint in case u use it. if its not use then cases will be passed.
	}
	@Test
	public void demo2() {
		String actualResult = "true";
		String expectedResult = "false";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		System.out.println("String Assertion has passed");
		sa.assertAll();//this is the checkpoint in case u use it. if its not use then cases will be passed.
	}
}
