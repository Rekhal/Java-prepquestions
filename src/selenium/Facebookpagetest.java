package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookpagetest {

	public static void main(String[] args)   {
		mainpage();
	}
		public static void mainpage()  {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println("title of webpage is"+title);
		String currenturl=driver.getCurrentUrl();
		System.out.println("current url of webpage is:"+currenturl);
        WebElement emailtext=driver.findElement(By.cssSelector("#email"));
        emailtext.sendKeys("rek123_9920@yahoo.com");
        WebElement password=driver.findElement(By.cssSelector("#pass"));
        password.sendKeys("Tavish12#");
        WebElement button=driver.findElement(By.cssSelector("#loginbutton"));
        button.click();
        WebElement navigationlabel=driver.findElement(By.cssSelector("#userNavigationLabel"));
        navigationlabel.click();
       // WebElement dropdown=driver.findElement(By.cssSelector("#BLUE_BAR_ID_DO_NOT_USE"));
       // dropdown.click();
        WebElement logout=driver.findElement(By.name("_54ni navSubmenu __MenuItem _54ne selected"));
        logout.click();
        
	}

}
