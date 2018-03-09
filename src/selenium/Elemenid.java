package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elemenid {

	public static void main(String[] args) {
		googlepage();
		//salesforcepage();
	}
		
		public static void googlepage(){
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			String windowhandle=driver.getWindowHandle();
			System.out.println("windowhandle is:" +windowhandle);
			String url=driver.getCurrentUrl();
			System.out.println("current url is:" +url);
			WebElement searchbox=driver.findElement(By.cssSelector("#lst-ib"));//using css selector
	       searchbox.sendKeys("selenium");
	       // WebElement searchbutton=driver.findElement(By.name("btnK"));//using name for buttonelement
	        WebElement searchbutton=driver.findElement(By.cssSelector("input[name='btnK']"));//using css selector filter tagname,attribute,value for buttonelement
	       searchbutton.click();
	           try{
	       WebElement searchlink=driver.findElement(By.linkText("Selenium - Web Browser Automation"));//using linktext for anchor tags
	       searchlink.click();
	       }
	       catch(NoSuchElementException e){
	    	   System.out.println("Element is not found:" +e);
	       }
		}

		
	
public static void salesforcepage()
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.salesforce.com/");
	String title=driver.getTitle();
	System.out.println("current title of webpage:"+title);
	String url=driver.getCurrentUrl();
	System.out.println("current title of wepage is:" +url);
	WebElement demobutton=driver.findElement(By.cssSelector("a[href='https://www.salesforce.com/form/demo/crm-service-demos.jsp?d=70130000000YuD8']"));//using css selector filter Tagname,attribute,value for button which has anchor Tag 
	System.out.println("to check if button is enabled or not?:"+demobutton.isEnabled());
	System.out.println("to check if button is displayed or not?:"+demobutton.isDisplayed());
	demobutton.click();
	}
}
