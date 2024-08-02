package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='account_name']")
	private WebElement OrganizationName;
	
	@FindBy(xpath="//select[@name='leadsource' ]")
	private WebElement LeadSource;
	
	@FindBy(xpath="//input[@name='title' ]")
	private WebElement Title;
	
	@FindBy(xpath="//input[@name='department' ]")
	private WebElement Department;
	
	@FindBy(xpath="//input[@name='email' ]")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='assistant' ]")
	private WebElement Assistant;
	
	@FindBy(xpath="//input[@name='assistantphone' ]")
	private WebElement AssistantPhone;
	
	@FindBy(xpath="//input[@name='phone' ]")
	private WebElement OfficePhone;
	
	@FindBy(xpath="//input[@name='mobile' ]")
	private WebElement Mobile;
	
	@FindBy(xpath="//input[@name='homephone' ]")
	private WebElement HomePhone;
	
	@FindBy(xpath="//input[@name='otherphone' ]")
	private WebElement OtherPhone;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]' ]")
	private WebElement saveBtn;

	public CreatingNewContact(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getLeadSource() {
		return LeadSource;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getDepartment() {
		return Department;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getAssistant() {
		return Assistant;
	}

	public WebElement getAssistantPhone() {
		return AssistantPhone;
	}

	public WebElement getOfficePhone() {
		return OfficePhone;
	}

	public WebElement getMobile() {
		return Mobile;
	}

	public WebElement getHomePhone() {
		return HomePhone;
	}

	public WebElement getOtherPhone() {
		return OtherPhone;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/** public void leadSourceOperation(WebDriver driver)
	 * {		Pg.No:77
	 * 		Select s=new Select(LeadSource);
	 * 		s.selectByVisibleText("Employee");
	 * }
	 */
	
	public void createNewContact(String FirstName,String LastName,String OrganizationName)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getOrganizationName().sendKeys(OrganizationName);
		saveBtn.click();
	}
	
	public void createNewContact(String FirstName,String LastName,String OrganizationName,
			String LeadSource,String Title,String Department,String Email,
			String Assistant,String AssistantPhone)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getOrganizationName().sendKeys(OrganizationName);
		getLeadSource().sendKeys(LeadSource);
		getTitle().sendKeys(Title);
		getDepartment().sendKeys(Department);
		getEmail().sendKeys(Email);
		getAssistant().sendKeys(Assistant);
		getAssistantPhone().sendKeys(AssistantPhone);
		saveBtn.click();
	}
	
	public void createNewContact(String OfficePhone,String Mobile,
			String HomePhone,String OtherPhone)
	{
		getOfficePhone().sendKeys(OfficePhone);
		getMobile().sendKeys(Mobile);
		getHomePhone().sendKeys(HomePhone);
		getOtherPhone().sendKeys(OtherPhone);
		saveBtn.click();
	}
	
	public void createNewContact(String FirstName,String LastName,String OrganizationName,
			String LeadSource,String Title,String Department,String Email,
			String Assistant,String AssistantPhone,String OfficePhone,String Mobile,
			String HomePhone,String OtherPhone)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getOrganizationName().sendKeys(OrganizationName);
		getLeadSource().sendKeys(LeadSource);
		getTitle().sendKeys(Title);
		getDepartment().sendKeys(Department);
		getEmail().sendKeys(Email);
		getAssistant().sendKeys(Assistant);
		getAssistantPhone().sendKeys(AssistantPhone);
		getOfficePhone().sendKeys(OfficePhone);
		getMobile().sendKeys(Mobile);
		getHomePhone().sendKeys(HomePhone);
		getOtherPhone().sendKeys(OtherPhone);
		saveBtn.click();
	}
}
