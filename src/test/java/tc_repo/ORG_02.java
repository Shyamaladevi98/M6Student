package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewOrganizationPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class ORG_02 extends BaseClass
{
	@Test (groups= {"smoke","sanity"})
	public void org02tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String OrgName=EUTIL.readDataFromExcel("Organization", 5, 1);
		String Website=EUTIL.readDataFromExcel("Organization", 5, 2);
		String Employees=EUTIL.readDataFromExcel("Organization",5, 3);
		String Phn=EUTIL.readDataFromExcel("Organization", 5, 4);
		String OtherPhn=EUTIL.readDataFromExcel("Organization", 5, 5);
		String Email=EUTIL.readDataFromExcel("Organization", 5, 6);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonOrganization();
		OrganizationPage org=new OrganizationPage(driver);
		org.OrganizationPage();
		
		CreatingNewOrganizationPage COP=new CreatingNewOrganizationPage(driver);
		COP.createNewOrganization(OrgName+num, Website, Employees,Phn,OtherPhn,Email);
		System.out.println("org02 execution Success!!");
	}
}
