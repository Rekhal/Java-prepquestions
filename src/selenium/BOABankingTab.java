package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;


public class BOABankingTab {

	
	WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void mainpage(){
	driver.get("https://www.bankofamerica.com/");
	String Title=driver.getTitle();
	Assert.assertEquals(Title, "Bank of America — Banking, Credit Cards, Mortgages and Auto Loans");
	System.out.println("Title of webpage is:"+Title);
	}
	@Test
	public void bankingTab(){
	WebElement bankingtab=driver.findElement(By.linkText("Banking"));
	bankingtab.click();
	WebElement Checkingtab=driver.findElement(By.linkText("Checking"));
	Checkingtab.click();
	WebElement zipcode=driver.findElement(By.cssSelector("#zipCodeModalInputField"));
	zipcode.sendKeys("75024");
	Assert.assertEquals("75024", "75024");
	WebElement GoTab=driver.findElement(By.cssSelector("#go-button-zip-modal"));
	GoTab.click();
    WebElement selectcountyTab=driver.findElement(By.cssSelector("select"));
    System.out.println("User wants to verfy the tag name:"+selectcountyTab.getTagName());
    Select selectobj=new Select(selectcountyTab);
    List<WebElement> listobj=selectobj.getOptions();
    String defaulttextread=selectobj.getFirstSelectedOption().getText();
    System.out.println("Default option is:"+defaulttextread);
    System.out.println("number of options in the List:"+listobj.size());
    selectobj.selectByVisibleText("COLLIN, TX");;
    WebElement gobutton=driver.findElement(By.cssSelector("#go-button-county-modal"));
    gobutton.click();
	}

	@AfterTest
	public void closebrowser(){
		driver.quit();
	}
}
