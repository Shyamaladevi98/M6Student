package genericlibOrUtility;
	

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;

	public class SeleniumutilityOrwebdriverUtility
	{
		Actions act=null;
		Select s=null;
		Alert alt=null;
		
		/*
		 * 
		 */
		public void maximizeTheWindow(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		
		/**
		 * 
		 */
		
		public void setTheImplicitWait(WebDriver driver,int time)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}
		
		/**
		 * 
		 */
		
		public void moveToTheParticularElement(WebDriver driver,WebElement element)
		{
			act=new Actions(driver);
			act.moveToElement(element).perform();
		}
		
		/**
		 * 
		 */
		
		public void rightclickTheParticularElement(WebDriver driver,WebElement element)
		{
			act=new Actions(driver);
			act.contextClick(element).perform();
			// or use act.contextClick().perform();//
		}
		
		/**
		 * 
		 */
		 public void clickTheParticularElement(WebDriver driver,WebElement element)
		 {
			 act=new Actions(driver);
			 act.click(element).perform();
		 }
		 
		 /**
		  * 
		  */
		 
		 public void dragTheElementFromDropToTheElement(WebDriver driver,WebElement src,WebElement target)
		 {
			 act=new Actions(driver);
			 act.dragAndDrop(src, target).perform();
		 }
		 
		 /**
		  * 
		  */
		 
		 public void dragTheElementToIncreaseOrDecreaseTheFlow(WebDriver driver,WebElement element,int x,int y)
		 {
			 act=new Actions(driver);
			 act.dragAndDropBy(element, x, y).perform();
		 }
		 
		 /**
		  * 
		  */
		 
		 public void scrollTheParticularElement(WebDriver driver,WebElement element)
		 {
			 act=new Actions(driver);
			 act.scrollToElement(element).perform();
		 }
		 
		 /**
		  * 
		  */
		 
		 public void clickTheParticularElementAndHold(WebDriver driver,WebElement element)
		 {
			 act=new Actions(driver);
			 act.clickAndHold(element).perform();
		 }
		 
		 /**
		  * 
		  */
		 
		 public void releaseTheParticularElement(WebDriver driver,WebElement element)
		 {
			 act=new Actions(driver);
			 act.release(element).perform();
		 }
		 
		 /**
		  * 
		  */
		 public void dropdownSelectBasedOnIndex(WebElement element,int index)
		 {
			 s=new Select(element);
			 s.selectByIndex(index);
		}
		 
		/**
		 * 
		 */
		 
		 public void dropdownSelectBasedOnValueOrAttribute(WebElement element,String value)
		 {
			 s=new Select(element);
			 s.selectByValue(value);
		 }
		 
		 /**
		  * 
		  */
		 
		 public void dropdownSelectBasedOnVisibleText(WebElement element,String Text)
		 {
			 s=new Select(element);
			 s.selectByVisibleText(Text);
		 }
		 
		 /**
		  * 
		  */
		 
		 public List<WebElement> dropdownSelectOrGetAllTheOptions(WebElement element)
		 {
			 s=new Select(element);
			List<WebElement> options=s.getAllSelectedOptions();
			return options;
		 }

		 /**
		  * 
		  */
		 
		 public void dropdownDeSelectBasedOnIndex(WebElement element,int index)
		 {
			 s=new Select(element);
			 s.deselectByIndex(index);
		 }
		 
		 /**
		  * 
		  */
		 
		 public void dropdownDeSelectBasedOnValueOrAttribute(WebElement element,String value)
		 {
			 s=new Select(element);
			 s.deselectByValue(value);
		 }
		 
		 /**
		  * 
		  */
		 
		 public void dropdownDeSelectBasedOnVisibleText(WebElement element,String Text)
		 {
			 s=new Select(element);
			 s.deselectByVisibleText(Text);
		 }
		 
		 /**
		  * 
		  */
		 
		 public void dropdownDeSelectAllTheOptions(WebElement element)
		 {
			 s=new Select(element);
			 s.deselectAll();
		 }
		 
		 /**
		  * 
		  */
		 
		 public void dropdownMultiSelectedOrNot(WebElement element)
		 {
			 s=new Select(element);
			 s.isMultiple();
		 }
		 
		 /**
		  * 
		  */
		 
		public void AcceptTheAlertPopup(WebDriver driver)
		{
			alt=driver.switchTo().alert();
			alt.accept();
		}
		
		/**
		 * 
		 */
		 
		public void dismissTheAlertPopup(WebDriver driver)
		{
			alt=driver.switchTo().alert();
			alt.dismiss();
		}
		
		/**
		 * 
		 */
		
		public String alertpopupGetTheText(WebDriver driver)
		{
			alt=driver.switchTo().alert();
			String alertmsg=alt.getText();
			return alertmsg;
		}
		
		/**
		 * 
		 */
		
		public void alertpopupPassTheMessage(WebDriver driver,String msg)
		{
			alt=driver.switchTo().alert();
			alt.sendKeys(msg);
		}
		
		/**
		 * 
		 * 
		 */
		
		public void scrolldownUseJavaScriptExecutor(WebDriver driver,String value)
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript(value);
		}
		
		/**
		 * 
		 */
		
		public void usingScreenshot(WebDriver driver,WebElement source,String path) throws Exception
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			Files.copy(src, dest);
		}
		
		/**
		 *  
		 * 
		 */
		
		public void clickAnElementFailTryMoreTimesToClick(WebDriver driver,WebElement element,int time) throws Exception  
		{
			int count=0, reclickcount=5;
			while(count<=reclickcount)
			{
				element.click();
				Thread.sleep(time);
				break;
			}
			
		}
		
		/**
		 * 
		 */
		
		public void handleTheWindows(WebDriver driver)
		{
			String parentWindow=driver.getWindowHandle();
			Set<String> allWindow=driver.getWindowHandles();
			
			Iterator<String> itr=allWindow.iterator();
			while(itr.hasNext())
			{
				String values=itr.next();
				String title=driver.switchTo().window(values).getTitle();
				
				if(title.contains(values))
					break;
			}
		}
	}


