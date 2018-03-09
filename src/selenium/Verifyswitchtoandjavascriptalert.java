package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifyswitchtoandjavascriptalert {

	public static void main(String[] args) {
		//verifyswitchTojsalert();
		//verifyjsconfirm();
		prompttest();

	}

	public static void verifyswitchTojsalert(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		WebElement Alertinvoker=driver.findElement(By.cssSelector(".example>ul>li>button[onclick='jsAlert()']"));
		Alertinvoker.click();
		Alert alertwindow=driver.switchTo().alert();
		String message=alertwindow.getText();
		//alertwindow.accept();
		alertwindow.dismiss();
		
		System.out.println("The Alert Message is:"+message);
		
	}
public static void verifyjsconfirm(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	WebElement confirm=driver.findElement(By.cssSelector(".example>ul>li>button[onclick='jsConfirm()']"));
	confirm.click();
	Alert confirmobj=driver.switchTo().alert();
	System.out.println("The confirmwindow textmessage is:"+confirmobj.getText());
	//confirmobj.dismiss();
	confirmobj.accept();
	driver.switchTo().defaultContent();
	WebElement result=driver.findElement(By.cssSelector("#result"));
	String resultmsg=result.getText();
	System.out.println("The Result message is:"+resultmsg);
	
}
public static void prompttest(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	WebElement promptbutton=driver.findElement(By.cssSelector(".example>ul>li>button[onclick='jsPrompt()']"));
	promptbutton.click();
	Alert promptobj=driver.switchTo().alert();
	System.out.println("Prompt message is:"+promptobj.getText());
	promptobj.sendKeys("Testing prompt");
	promptobj.accept();
	driver.switchTo().defaultContent();
	WebElement result=driver.findElement(By.cssSelector("#result"));
	String resultmsg=result.getText();
	System.out.println("The result message for js prompt is:"+resultmsg);
	
}
}

