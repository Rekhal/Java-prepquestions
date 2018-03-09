package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Firefoxbaseclass {
	WebDriver driver;
	@BeforeTest	
	public void baseclassurl(){	
		
	    driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
