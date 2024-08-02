package sample_Repo;


import org.testng.annotations.Test;

public class Program2 
{
	
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("CU");
	}
	@Test(priority=2,dependsOnMethods={"createUser"})
	public void modifyUser()
	{
		System.out.println("MU");
	}
}
