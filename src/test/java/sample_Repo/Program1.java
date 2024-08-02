package sample_Repo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Program1 
{
	@Ignore
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("CU");
	}
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("MU");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("DU");
	}
}
