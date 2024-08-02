package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class LE_04 extends BaseClass
{
	@Test (groups= {"smoke","sanity"})
	public void le04tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String FirstName=EUTIL.readDataFromExcel("Leads", 17, 1);
		String LastName=EUTIL.readDataFromExcel("Leads", 17, 2);
		String Company=EUTIL.readDataFromExcel("Leads", 17, 3);
		String Street=EUTIL.readDataFromExcel("Leads", 17, 4);
		String PoBox=EUTIL.readDataFromExcel("Leads", 17, 5);
		String PostalCode=EUTIL.readDataFromExcel("Leads", 17, 6);
		String City=EUTIL.readDataFromExcel("Leads", 17, 7);
		String Country=EUTIL.readDataFromExcel("Leads", 17, 8);
		String State=EUTIL.readDataFromExcel("Leads", 17, 9);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadPage lp=new LeadPage(driver);
		lp.LeadPage();
		
		CreatingNewLeadPage CNL=new CreatingNewLeadPage(driver);
		CNL.createLead(FirstName+num, LastName, Company, Street, PoBox, PostalCode, City, Country, State);
		System.out.println("LE04 execution Successful!!");
	}
}
