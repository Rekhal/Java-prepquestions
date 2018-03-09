package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Chromedrivertestbaseclass {
WebDriver driver;
@BeforeTest	
public void baseclassurl(){	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}
}