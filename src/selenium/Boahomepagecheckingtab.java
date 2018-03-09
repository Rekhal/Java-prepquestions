package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Boahomepagecheckingtab {

	WebDriver driver;
	@BeforeTest
	public void homepageurl(){
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String currenttitle=driver.getTitle();
		System.out.println("current title of webpage is:"+currenttitle);
				if(currenttitle.contentEquals("Bank of America - Banking, Credit Cards, Home Loans and Auto Loans")){
			System.out.println("title of the page matches");
			
		}else{
			System.out.println("title of the page doesnotmatch");
		}
	}
	
@Test
public void checkingtab(){
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement checkingtab=driver.findElement(By.cssSelector("#navChecking"));
	checkingtab.click();
}
@Test
public void corecheckingTab(){
	WebElement corechecking=driver.findElement(By.cssSelector("#coreChecking"));
	corechecking.click();
	WebElement zipcode=driver.findElement(By.cssSelector("#zipCodeModalInputField"));
	zipcode.sendKeys("75024");
    WebElement gobutton=driver.findElement(By.cssSelector("#go-button-zip-modal"));
    gobutton.click();
    WebElement dropdowncounty=driver.findElement(By.cssSelector("#countySelectModalSelect"));
    System.out.println("User wants to verify the select Tag for dropdown:"+dropdowncounty.getTagName());
    Select mydropdown=new Select(dropdowncounty);
    List<WebElement> useroptions=mydropdown.getOptions();
    System.out.println("Number of options in the page is:" +useroptions.size());  
    mydropdown.selectByVisibleText("COLLIN, TX");
    WebElement gobutton2=driver.findElement(By.cssSelector("#go-button-county-modal"));
    gobutton2.click();
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    WebElement opennowbutton=driver.findElement(By.cssSelector("#offer-learn-more-large"));
    opennowbutton.click();
    
}
}
