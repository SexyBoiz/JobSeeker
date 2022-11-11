package testNG;

import org.testng.annotations.Test;

public class enabledExecuteSelected {
	
	@Test
	public void a()
	{
		
	}
	@Test(enabled = false)//not to run this script coz we have made it disabled
	public void b()
	{
		
	}
	@Test(invocationCount = 0)//not to run this script
	public void c()
	{
		
	}
	@Test
	public void d()
	{
		
	}
}
