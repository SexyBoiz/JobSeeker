package testNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test //in testNG main method is not required instead use annotation
	public void a()
	{
		System.out.println("From Method A ");
	}
	@Test
	public void d()
	{
		System.out.println("From Method D ");
	}
	@Test
	public void c()
	{
		System.out.println("From Method C ");
	}
	@Test(priority = 2)//this will set the priority
	public void b()
	{
		System.out.println("From Method B ");
	}
}
