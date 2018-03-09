package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Boahomepage {
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
}

