package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class is a POM Class- a Login Page for Vtiger Application
 * @author-ShyamalaMuthiah
 */
public class vtigerLoginPage 
{
	//Loacate the element and create a varaiable //
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginBtn;

	// Create Constructor //

	public vtigerLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	//create getter() //
	
	public WebElement getUsername() 
	{
		return username;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getLoginBtn() 
	{
		return loginBtn;
	}
	
	// use Business Library //
	
	public void loginOperation(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();	
	}
/* or use getUsername().sendKeys(uname);
 * getpassword().sendKeys(pass);
 * getloginBtn().click();	
 */
}
