package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewOrganizationPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class ORG_01 extends BaseClass
{
	@Test (groups= {"smoke","regression"})
	public void org01tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String OrgName=EUTIL.readDataFromExcel("Organization", 1, 1);
		String Website=EUTIL.readDataFromExcel("Organization", 1, 2);
		String Employees=EUTIL.readDataFromExcel("Organization",1, 3);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonOrganization();
		OrganizationPage org=new OrganizationPage(driver);
		org.OrganizationPage();
		
		CreatingNewOrganizationPage COP=new CreatingNewOrganizationPage(driver);
		COP.createNewOrganization(OrgName+num, Website, Employees);
		System.out.println("org01 execution Success!!");
	}
}
