package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IncludeExcludedroupstest {
     
	WebDriver driver;
	@BeforeTest(alwaysRun=true)
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://testng.org/doc/");
		driver.manage().window().maximize();
	}	
		@Test(groups="sanity")
		public void comparetitles(){
		String title=driver.getTitle();
		String expectedtitle="TestNG - Welcome";
		System.out.println("The title of webpage is:" +title);
		String currenturl=driver.getCurrentUrl();
		System.out.println("current url of webpage is:"+currenturl);
		Assert.assertEquals(title, expectedtitle);
			}
@Test(groups="sanity")
public void documentationtab(){
	WebElement documentationclick=driver.findElement(By.linkText("Documentation"));
	documentationclick.click();
	driver.navigate().back();
}

@Test(groups="regression")
public void welcomeclick(){
	WebElement welcomeclick=driver.findElement(By.linkText("Welcome"));
	welcomeclick.click();
	driver.navigate().back();
}

@Test(groups="sanity")
public void downloadclick(){
	WebElement downloadclick=driver.findElement(By.linkText("Download"));
	downloadclick.click();
	driver.navigate().back();
}

@Test(groups="sanity2")
public void eclipseclick(){
	WebElement eclipseclick=driver.findElement(By.linkText("Eclipse"));
	eclipseclick.click();
	driver.navigate().back();
}

@Test(groups="regression")
public void IDEAclick(){
	WebElement IDEAclick=driver.findElement(By.linkText("IDEA"));
	IDEAclick.click();
	driver.navigate().back();
}

@Test(groups="sanity")
public void mavenclick(){
	WebElement mavenclick=driver.findElement(By.linkText("Maven"));
	mavenclick.click();
	driver.navigate().back();
}
}



