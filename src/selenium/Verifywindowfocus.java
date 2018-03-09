package selenium;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Verifywindowfocus {

	public static void main(String[] args) {
		//verifyframe();
		//verifydraganddrop();
		verifykeyboardctrls();
	}
		public static void verifywindow(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		String Parentwindowid=driver.getWindowHandle();
		System.out.println("Current parent windowhandle is:"+Parentwindowid);
		String title=driver.getTitle();
		System.out.println("Current title of parent page is:"+title);
		WebElement clickherelink=driver.findElement(By.cssSelector(".example>a"));
		clickherelink.click();
		int windowsize=driver.getWindowHandles().size();
		System.out.println("Total number of windows opened are:"+windowsize);
         for(String windowhandler:driver.getWindowHandles()){//for loop to focus on the child window instead of parent window
        	 driver.switchTo().window(windowhandler);//switching the focus to childwindow
         }
	System.out.println("childwindow id is:"+driver.getWindowHandle());
	System.out.println("childwindow Title is:"+driver.getTitle());
	driver.switchTo().window(Parentwindowid);
	driver.quit();
	}
	
public static void verifyframe(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://jqueryui.com/selectable/");
	WebElement framemenu=driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(framemenu);
	List<WebElement> itemslist=driver.findElements(By.cssSelector(".ui-widget-content.ui-selectee"));
	int listofitems=itemslist.size();
	System.out.println("Total list of items in frame is :"+listofitems);
	WebElement itemtext=driver.findElement(By.cssSelector(".ui-widget-content.ui-selectee:nth-child(3)"));
	itemtext.click();
	System.out.println("user selected the item :"+itemtext.getText());
	
}
public static void verifydraganddrop(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(frame);
	WebElement dragme=driver.findElement(By.cssSelector("#draggable"));
	WebElement dragmetext=driver.findElement(By.cssSelector("#draggable>p"));
	System.out.println("Before drag the text message is :"+dragmetext.getText());
	WebElement dropme=driver.findElement(By.cssSelector("#droppable"));
	WebElement dropmetext=driver.findElement(By.cssSelector("#droppable>p"));
	System.out.println("Before drop the text message is:" +dropmetext.getText());
	Actions actionobj=new Actions(driver);
	dragme.click();
	actionobj.build().perform();//for multiple actions call build.perform
	actionobj.dragAndDrop(dragme, dropme);
	actionobj.build().perform();
	System.out.println("After drop the text messge is:"+dropme.getText());
	
}

public static void verifykeyboardctrls(){
	//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.ie.driver","C:\\Users\\venkat\\Downloads\\IE32bit\\IEDriverServer.exe");
	DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
	WebDriver driver=new InternetExplorerDriver(caps);
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\venkat\\Downloads\\chromedriver.exe");
	//DesiredCapabilities caps=DesiredCapabilities.chrome();
	//WebDriver driver=new ChromeDriver(caps);

	driver.get("http://jqueryui.com/selectable/");
	WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(frame);
	List<WebElement> multipleitems=driver.findElements(By.cssSelector(".ui-widget-content.ui-selectee"));
	System.out.println("Total number of items in the frames is :"+multipleitems.size());
	Actions actobj=new Actions(driver);
	actobj.keyDown(Keys.CONTROL).perform();
		for(int i=0;i<=4;i++){
			multipleitems.get(i).click();
			System.out.println("User selected the items:"+multipleitems.get(i).getText());
	}
actobj.keyUp(Keys.CONTROL).perform();
}

}


