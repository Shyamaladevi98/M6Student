package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewOrganizationPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class ORG_04 extends BaseClass
{
	@Test (groups= {"regression"})
	public void org04tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String OrgName=EUTIL.readDataFromExcel("Organization", 13, 1);
		String Website=EUTIL.readDataFromExcel("Organization", 13, 2);
		String Employees=EUTIL.readDataFromExcel("Organization",13, 3);
		String Phn=EUTIL.readDataFromExcel("Organization", 13, 4);
		String OtherPhn=EUTIL.readDataFromExcel("Organization", 13, 5);
		String Email=EUTIL.readDataFromExcel("Organization", 13, 6);
		String BillingAddress=EUTIL.readDataFromExcel("Organization", 13, 7);
		String BillingCity=EUTIL.readDataFromExcel("Organization", 13, 8);
		String BillingState=EUTIL.readDataFromExcel("Organization", 13, 9);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonOrganization();
		OrganizationPage org=new OrganizationPage(driver);
		org.OrganizationPage();
		
		CreatingNewOrganizationPage COP=new CreatingNewOrganizationPage(driver);
		COP.createNewOrganization(OrgName+num, Website, Employees,Phn,OtherPhn,Email,
				BillingAddress,BillingCity,BillingState);
		System.out.println("org04 execution Success!!");

	}
}
