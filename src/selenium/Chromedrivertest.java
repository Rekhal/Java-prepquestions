package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Chromedrivertest extends Chromedrivertestbaseclass{

@Test(priority=0)
public void chrometest(){

	
	driver.manage().window().maximize();
	WebElement searchtext=driver.findElement(By.cssSelector("#lst-ib"));
	searchtext.sendKeys("selenium");
	searchtext.submit();
}
	
	@Test(priority=1,dependsOnMethods="chrometest")
	public void newpage()throws Exception{
		WebElement seleniumhq=driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		seleniumhq.click();
	}
}
