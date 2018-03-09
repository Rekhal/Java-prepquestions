package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Freecrmtestwebsite {

	WebDriver driver;
	@BeforeTest	
	public void setup(){	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String loginpagewindowhandle=driver.getWindowHandle();
		System.out.println("loginpagewindowhandle is:"+loginpagewindowhandle);
	}
	
@Test(priority=1)

public void homepagetest(){
	
	
	WebElement username=driver.findElement(By.cssSelector(".form-control[name='username']"));
	username.sendKeys("rekhal");
	WebElement pswd=driver.findElement(By.cssSelector(".form-control[name='password']"));
	pswd.sendKeys("Tavish123");
	WebElement btn=driver.findElement(By.cssSelector(".btn.btn-small"));
	btn.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@Test(priority=2)

public void verifyusercanlogout() throws InterruptedException{
	WebElement homepageframe=driver.findElement(By.name("mainpanel"));
	driver.switchTo().frame(homepageframe);
	WebElement logoutlink=driver.findElement(By.cssSelector(".topnavlink[href='https://www.freecrm.com/index.cfm?logout=1']"));
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	logoutlink.click();
	Thread.sleep(3000);
}

/*@AfterMethod

public void closebrowser(){
	
	driver.quit();
}*/

}
