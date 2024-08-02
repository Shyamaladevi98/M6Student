package genericlibOrUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;


public class BaseClass 
{
	public static WebDriver driver=null;
	public SeleniumutilityOrwebdriverUtility SUTIL=new SeleniumutilityOrwebdriverUtility();
	public propertiesUtilOrLib PUTIL=new propertiesUtilOrLib();
	
	@BeforeSuite(alwaysRun=true)
	public void createDbConnection()
	{
		System.out.println("db Connection Succesful!!");
	}
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws Exception
	{
		
		String URL=PUTIL.getDataFromProperties("url");
		
		driver=new ChromeDriver();
		SUTIL.setTheImplicitWait(driver, 10);
		SUTIL.maximizeTheWindow(driver);
		driver.get(URL);
		System.out.println("Launching Successful!!");
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Exception
	{
		
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		LoginPage Lp=new LoginPage(driver);
		Lp.loginToApplication(USERNAME,PASSWORD);
		System.out.println("Login Success!!");
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("Logout Success!!");
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Browser Closed Successfully!!");
	}
	
	@AfterSuite(alwaysRun=true)
	public void closedDbConnection()
	{
		System.out.println("db Connection Closed!!");
	}
}
