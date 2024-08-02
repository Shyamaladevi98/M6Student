package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewOrganizationPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class ORG_03 extends BaseClass
{
	@Test (groups= {"smoke"})
	public void org03tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String OrgName=EUTIL.readDataFromExcel("Organization", 9, 1);
		String Website=EUTIL.readDataFromExcel("Organization", 9, 2);
		String Employees=EUTIL.readDataFromExcel("Organization",9, 3);
		String BillingAddress=EUTIL.readDataFromExcel("Organization", 9, 4);
		String BillingCity=EUTIL.readDataFromExcel("Organization", 9, 5);
		String BillingState=EUTIL.readDataFromExcel("Organization", 9, 6);
		String Email=EUTIL.readDataFromExcel("Organization", 9, 7);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonOrganization();
		OrganizationPage org=new OrganizationPage(driver);
		org.OrganizationPage();
		
		CreatingNewOrganizationPage COP=new CreatingNewOrganizationPage(driver);
		COP.createNewOrganization(OrgName+num, Website, Employees,BillingAddress,
				BillingCity,BillingState,Email);
		System.out.println("org03 execution Success!!");

	}
}
