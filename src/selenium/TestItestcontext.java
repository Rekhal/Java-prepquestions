package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestItestcontext {
    WebDriver driver;
	@BeforeTest(alwaysRun=true)
	public void openbrowser(ITestContext context){
		String username=context.getCurrentXmlTest().getParameter("username");
		String browser=context.getCurrentXmlTest().getParameter("browser");
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			System.out.println("openened browser is firefox");
		}else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");	
			driver=new ChromeDriver();
			System.out.println("opened browser is Chrome");
			}
		}
		
	@Test(priority=0)
	public void openurl(){
		driver.get("http://testng.org/doc/");
		driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("current titile of webpage is:"+title);
	}
	@Test(priority=1)
	public void opendoc(){
		WebElement documentationclick=driver.findElement(By.linkText("Documentation"));
		documentationclick.click();
	}
	@Test(priority=2)
	public void welcomeclick(){
		WebElement welcomeclick=driver.findElement(By.linkText("Welcome"));
		welcomeclick.click();
	}
	@AfterMethod
	public void aftermethod(ITestResult result ){
		String testname=result.getName();
		System.out.println("Test Methods Executed:"+testname);
		int status=result.getStatus();
		System.out.println("Test Result Status is:"+status);
	}
	}

