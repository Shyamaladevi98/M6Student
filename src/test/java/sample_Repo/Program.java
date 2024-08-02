package sample_Repo;

import org.testng.annotations.Test;

/**@Test is mandatory for all the TestCases, without @Test TestCases will not participate in execution.
 * We can provide @Test in class level but it is not a recommended choice because in a class 
 *	 some generic functions(methods) also willl be present & in this those functions also
 * 	 will be executed like testcases.
 * We should always provide @Test in method level.
 */

public class Program 
{
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
	public void deleteuser()
	{
		System.out.println("DU");
	}
}
