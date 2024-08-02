package ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/**
	 * This is a LoginPage POM Class
	 * @author-Shyamala
	 */
	
//No.of Webpages=No.of POM Class because Every webpage we can create POM Class
	 
public class LoginPage 
{
//WebElement should be private & the locator we are using should be kept
//inside(@FindBy or @FindBys() or @FindAll()) //
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginButton;
	
//We need to create a public Constructor to initialize the elements using 
//a static method initElements() which is present inside pagefactory class
//which is initializes the currentclass(this keyword) Elements.//
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//We need to getter() to access the Elements.
	
	public WebElement getUsernameTextfield() 
	{
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() 
	{
		return passwordTextfield;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	
//We need Business Libraries to Optimize the Code.

	/**This is a Business library method to perform login operation to application.
	 * @param username
	 * @param password
	 */
	
	public void loginToApplication(String username,String password)
	{
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
		}
