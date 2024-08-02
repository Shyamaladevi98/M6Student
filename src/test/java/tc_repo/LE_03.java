package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class LE_03 extends BaseClass
{
	@Test (groups= {"regression"})
	public void le03tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String FirstName=EUTIL.readDataFromExcel("Leads", 13, 1);
		String LastName=EUTIL.readDataFromExcel("Leads", 13, 2);
		String Company=EUTIL.readDataFromExcel("Leads", 13, 3);
		String Title=EUTIL.readDataFromExcel("Leads", 13, 4);
		String Phone=EUTIL.readDataFromExcel("Leads", 13, 5);
		String Mobile=EUTIL.readDataFromExcel("Leads", 13, 6);
		String Email=EUTIL.readDataFromExcel("Leads", 13, 7);
		String Employees=EUTIL.readDataFromExcel("Leads", 13, 8);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadPage lp=new LeadPage(driver);
		lp.LeadPage();
		
		CreatingNewLeadPage CNL=new CreatingNewLeadPage(driver);
		CNL.createLead(FirstName+num, LastName, Company, Title, Phone,Mobile, Email, 
				Employees);
		System.out.println("LE03 execution Successful!!");
	}
}
