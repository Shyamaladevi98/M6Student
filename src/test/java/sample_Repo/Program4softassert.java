package sample_Repo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program4softassert
{
	@Test
	public void strictLevelComparison()
	{
		String expectedValue="raja";
		String actualValue="raja";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualValue, expectedValue);
		System.out.println("assertion Passed!!");
		sf.assertAll();
	}
	
	@Test
	public void containsLevelComparison()
	{
		String expectedValue="raja";
		String actualValue="Maharaja";
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(actualValue.contains(expectedValue));
		System.out.println("contains Passed!!");
		sf.assertAll();
	}
}
