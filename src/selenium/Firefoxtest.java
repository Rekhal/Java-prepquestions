package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Firefoxtest extends Firefoxbaseclass{


@Test(priority=1)
public void googlepagetest(){

	
	//driver.manage().window().maximize();
	WebElement searchtext=driver.findElement(By.cssSelector("#lst-ib"));
	searchtext.sendKeys("selenium");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	searchtext.submit();
	}
	
	@Test(priority=3,dependsOnMethods="googlepagetest")
	public void googlenewpage()throws Exception{
		WebElement seleniumhq=driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		seleniumhq.click();
	}
}
