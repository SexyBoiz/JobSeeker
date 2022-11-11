package testNG;

import org.testng.annotations.Test;

public class invocationCount {
	@Test(invocationCount = 5)//make one method execute sevral times
	public void demo() {
		System.out.println("Demo");
	}
}
