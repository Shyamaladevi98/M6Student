package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
		@FindBy(xpath="//a[text()='Leads']")
		private WebElement leads;
		
		@FindBy(xpath="//a[text()='Organizations']")
		private WebElement organization;
		
		@FindBy(xpath="//a[text()='Contacts']")
		private WebElement contacts;
		
		@FindBy(xpath="//table/tbody/tr/td[@class='small' and @align='right']/table/tbody/tr/td[@class='small']")
		private WebElement admin;
		
		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement logout;

		public HomePage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);	
		}

		public WebElement getLeads() 
		{
			return leads;
		}

		public WebElement getOrganization() 
		{
			return organization;
		}

		public WebElement getContacts() 
		{
			return contacts;
		}

		public WebElement getAdmin() 
		{
			return admin;
		}

		public WebElement getLogout() 
		{
			return logout;
		}
		
		public void clickonLeads()
		{
			leads.click();
		}
		
		public void clickonOrganization()
		{
			organization.click();
		}
		
		public void clickonContacts()
		{
			contacts.click();
		}
		 public void logoutOperation(WebDriver driver)
		 {
			 Actions act=new Actions(driver);
			 act.moveToElement(admin).perform();
			 logout.click();
		 }
}
