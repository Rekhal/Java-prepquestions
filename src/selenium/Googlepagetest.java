package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Googlepagetest {
@Test
public void googpage(){
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println("current title of webpage is:" +title);
	WebElement searchtext=driver.findElement(By.cssSelector("#lst-ib"));
	searchtext.sendKeys("selenium");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement listitems=driver.findElement(By.cssSelector("#sbse0>.sbqs_c"));
	listitems.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement searchbutton=driver.findElement(By.cssSelector("input[name='btnK']"));
	searchbutton.click();
}
}
