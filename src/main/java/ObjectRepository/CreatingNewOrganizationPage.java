package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage
{
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement Website;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement Employees;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phn;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement OtherPhn;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement Email;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddress;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement BillingCity;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement BillingState;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public CreatingNewOrganizationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgName() {
		return OrgName;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getEmployees() {
		return Employees;
	}

	public WebElement getPhn() {
		return Phn;
	}

	public WebElement getOtherPhn() {
		return OtherPhn;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getBillingCity() {
		return BillingCity;
	}

	public WebElement getBillingState() {
		return BillingState;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createNewOrganization(String OrgName,String Website,String Employees)
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(Website);
		getEmployees().sendKeys(Employees);
		saveBtn.click();
	}
	
	public void createNewOrganization(String OrgName,String Website,String Employees,
			String Phn,String OtherPhn,String Email)
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(Website);
		getEmployees().sendKeys(Employees);
		getPhn().sendKeys(Phn);
		getOtherPhn().sendKeys(OtherPhn);
		getEmail().sendKeys(Email);
		saveBtn.click();
	}
	
	public void createNewOrganization(String OrgName,String Website,String Employees,
			String BillingAddress,String BillingCity,String BillingState,String Email)
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(Website);
		getEmployees().sendKeys(Employees);
		getBillingAddress().sendKeys(BillingAddress);
		getBillingCity().sendKeys(BillingCity);
		getBillingState().sendKeys(BillingState);
		getEmail().sendKeys(Email);
		saveBtn.click();
	}
	
	public void createNewOrganization(String OrgName,String Website,String Employees,
			String Phn,String OtherPhn,String Email,String BillingAddress,
			String BillingCity,String BillingState)
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(Website);
		getEmployees().sendKeys(Employees);
		getPhn().sendKeys(Phn);
		getOtherPhn().sendKeys(OtherPhn);
		getEmail().sendKeys(Email);
		getBillingAddress().sendKeys(BillingAddress);
		getBillingCity().sendKeys(BillingCity);
		getBillingState().sendKeys(BillingState);
		saveBtn.click();
	}
	
}
