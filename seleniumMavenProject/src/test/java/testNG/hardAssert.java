package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class hardAssert {
	@Test
	public void demo()
	{
		String actualResult="Qspider";
		String expectedResult="Qspider";
		
		//Assert.assertEquals(actualResult, expectedResult);

		assertEquals(actualResult, expectedResult);
		System.out.println("Checkpoint 1 is verified");
	}
}
