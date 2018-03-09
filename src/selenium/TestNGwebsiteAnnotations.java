package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNGwebsiteAnnotations {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest(){
	driver=new FirefoxDriver();
	driver.get("http://testng.org/doc/");
	}
	
	@Test(priority=0)
	public void testnghomepage(){
	
		String currentTitle=driver.getTitle();
		System.out.println("current Title of webpage is:" +currentTitle);
		assertEquals(currentTitle, "TestNG - Welcome");
		
	}
	@Test(priority=1)
	public void clickondocumentation() throws Exception{
	  WebElement docclick=driver.findElement(By.cssSelector("#topmenu>table>tbody>tr>td>a[href=\"documentation-main.html\"]"));
	  docclick.click();	
	  Thread.sleep(800);
	}
	@Test(priority=2)
	public void clickondownload() throws Exception{
		WebElement download=driver.findElement(By.cssSelector("#topmenu>table>tbody>tr>td>a[href=\"download.html\"]"));
		download.click();
		Thread.sleep(800);
	}
	@AfterTest
	public void aftertest(){
		driver.close();
	}
}
