package sample_Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;

@Listeners(genericlibOrUtility.ListenersImplementationClass.class)
public class Sample1 extends BaseClass
{
	@Test
	public void loginOperationCrossCheck()
	{
		driver.findElement(By.xpath("hjghjghjghjgh")).click();
	}
	
}
