package tc_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadPage;
import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilOrLib;
import genericlibOrUtility.JavaLibrary;

public class LE_01 extends BaseClass
{
	@Test (groups= {"smoke"})
	public void le01Tc() throws Exception
	{
		ExcelUtilOrLib EUTIL=new ExcelUtilOrLib();
		String FirstName=EUTIL.readDataFromExcel("Leads", 5, 1);
		String LastName=EUTIL.readDataFromExcel("Leads", 5, 2);
		String Company=EUTIL.readDataFromExcel("Leads", 5, 3);
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadPage lp=new LeadPage(driver);
		lp.LeadPage();
		
		CreatingNewLeadPage CNL=new CreatingNewLeadPage(driver);
		CNL.createLead(FirstName+num,LastName,Company);
		System.out.println("LE01 execution Successful!!");
		
	}
}
