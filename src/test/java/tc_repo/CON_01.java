package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.ContactPage;
import ObjectRepository.CreatingNewContact;
import ObjectRepository.HomePage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class CON_01 extends BaseClass
{
	@Test (retryAnalyzer=genericlibOrUtility.RetryAnalzerImplementationClass.class)
	public void con01tc() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickonContacts();
		ContactPage cp=new ContactPage(driver);
		cp.contactPage();
		
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String FirstName=EUTIL.readDataFromExcel("Contacts", 1, 1);
		String LastName=EUTIL.readDataFromExcel("Contacts", 1, 2);
		String OrganizationName=EUTIL.readDataFromExcel("Contacts", 1, 3);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		
		CreatingNewContact CNC=new CreatingNewContact(driver);
		CNC.createNewContact(FirstName+num, LastName, OrganizationName);
		System.out.println("con01 execution Success!!");
	}
}
