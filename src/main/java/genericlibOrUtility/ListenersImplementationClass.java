package genericlibOrUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementationClass implements ITestListener
{
	public SeleniumutilityOrwebdriverUtility sutil=null;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"execution Starts!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"execution Pass!!");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		try
		{
			
		}
		catch(Exception e)
		{
		
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"execution Skip!!");
	}
	
}
