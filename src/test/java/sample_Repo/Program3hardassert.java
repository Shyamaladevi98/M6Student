package sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program3hardassert
{
	@Test
	public void strictLevelComparison()
	{
		String expectedValue="raja";
		String actualValue="raja";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("assertion Passed!!");
	}
	
	@Test
	public void containsLevelComparison()
	{
		String expectedValue="raja";
		String actualValue="Maharaja";
		Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("contains Passed!!");
	}
}
