package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class LE_02 extends BaseClass
{
	@Test (groups= {"sanity"})
	public void le02tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String FirstName=EUTIL.readDataFromExcel("Leads", 9, 1);
		String LastName=EUTIL.readDataFromExcel("Leads", 9, 2);
		String Company=EUTIL.readDataFromExcel("Leads", 9, 3);
		String Title=EUTIL.readDataFromExcel("Leads", 9, 4);
		String Phone=EUTIL.readDataFromExcel("Leads", 9, 5);
		String Mobile=EUTIL.readDataFromExcel("Leads", 9, 6);
		String Email=EUTIL.readDataFromExcel("Leads", 9, 7);
		String Employees=EUTIL.readDataFromExcel("Leads", 9, 8);
		String Street=EUTIL.readDataFromExcel("Leads", 9, 9);
		String PoBox=EUTIL.readDataFromExcel("Leads", 9, 10);
		String PostalCode=EUTIL.readDataFromExcel("Leads", 9, 11);
		String City=EUTIL.readDataFromExcel("Leads", 9, 12);
		String Country=EUTIL.readDataFromExcel("Leads", 9, 13);
		String State=EUTIL.readDataFromExcel("Leads", 9, 14);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadPage lp=new LeadPage(driver);
		lp.LeadPage();
		
		CreatingNewLeadPage CNL=new CreatingNewLeadPage(driver);
		CNL.createLead(FirstName+num, LastName, Company, Title, Phone,Mobile, Email, 
				Employees, Street, PoBox, PostalCode, City, Country, State);
		System.out.println("LE02 execution Successful!!");
	}
}
