package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorialpointalerttest {

	public static void main(String[] args) {
		Alertdialogboxtest();

	}
public static void Alertdialogboxtest() {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
	String parentwindowhandle=driver.getWindowHandle();
	System.out.println("Parentwindowhandle Id is:"+parentwindowhandle);
	//((JavascriptExecutor)driver).executeScript("Scroll(400,400)");
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement AlertInvoker=driver.findElement(By.cssSelector(".btn.btn-default[onclick=\"window.open('/javascript/javascript_alert_box_example_1.cfm','popUpWindow','height=500,width=800,left=100,top=100,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no, status=yes');return false;\"]"));
	AlertInvoker.click();
	Alert alertobj=driver.switchTo().alert();
	alertobj.accept();
	
	String currenturl=driver.getCurrentUrl();
	System.out.println("The current focus is in the URL:"+currenturl);
	//WebElement closethispage=driver.findElement(By.cssSelector("html>body>div>p>a[href='JavaScript:self.close();']"));
	//closethispage.click();
    driver.switchTo().window(parentwindowhandle).close();
    driver.quit();
	//WebElement closethispage=driver.findElement(By.cssSelector("html>body>div>p>a[href='JavaScript:self.close();']"));
	//closethispage.click();
	
	
}
}
