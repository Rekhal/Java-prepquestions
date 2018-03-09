package selenium;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class VerifydataprovidersTakescreenshotgmailacct {

WebDriver driver;
	
@BeforeTest
public void openurl(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	
}
	
@Test(dataProvider="login_page")
public void openpage(String username,String password) throws Exception{
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.getTitle();
	driver.getCurrentUrl();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//WebElement signin=driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in"));
	//signin.click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement username2=driver.findElement(By.cssSelector("#identifierId"));
	username2.sendKeys(username);
	WebElement Nextbutton=driver.findElement(By.cssSelector(".RveJvd.snByac"));
	Nextbutton.click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	WebElement password2=driver.findElement(By.cssSelector("input[type='password']"));
	password2.sendKeys(password);
	WebElement afterpasswordnext=driver.findElement(By.cssSelector("#passwordNext"));
	afterpasswordnext.click();
	Thread.sleep(5000);
	WebElement Inbox=driver.findElement(By.linkText("Inbox (74)"));
	Inbox.click();
	String Inboxtext=Inbox.getText();
	Thread.sleep(3000);
	Assert.assertEquals(Inboxtext, "Inbox (74)");
	if(Inboxtext=="Inbox (74)"){
	System.out.println("test is passed");
	}else{
		System.out.println("Test is failed");
	}
	
	WebElement signoutlogo=driver.findElement(By.cssSelector(".gb_ab.gbii"));
	signoutlogo.click();
	WebElement logoutbutton=driver.findElement(By.cssSelector("#gb_71"));
	logoutbutton.click();
	Thread.sleep(5000);
	WebElement switchacct=driver.findElement(By.cssSelector(".mUbCce.fKz7Od.YYBxpf.KEavsb"));
	switchacct.click();
	Thread.sleep(4000);
	/*WebElement removeacct=driver.findElement(By.cssSelector(".q4UYxb"));
	removeacct.click();
	WebElement crossremove=driver.findElement(By.cssSelector(".k6Zj8d.asG8Cb"));
	crossremove.click();
	Alert obj=driver.switchTo().alert();*/
	WebElement useanotheracct=driver.findElement(By.cssSelector(".wDzjuc.hPcO1c>svg[fill='#757575']"));
	useanotheracct.click();
	Thread.sleep(5000);

	//WebElement Yesremove=driver.findElement(By.cssSelector(".tk3N6e-LgbsSe-n2to0e.tk3N6e-LgbsSe-JbbQac-i5vt6e.x81T2e.tk3N6e-LgbsSe-ZmdkE"));
	//Yesremove.click();
	//WebElement done=driver.findElement(By.cssSelector("button[jsname='z9z6qf']"));
	//done.click();
	System.out.println("username is:" +username);
	System.out.println("password is:"+password);
	
}

@DataProvider(name="login_page")
public Object[][] logintest(){
	Object[][] positivenegative=new Object[2][2];
	
	positivenegative[0][0]="rekha.vajjha";
	positivenegative[0][1]="tavish123";
	
	positivenegative[1][0]="rek";
	positivenegative[1][1]="tavish123";
	
	return positivenegative;
	
}
@AfterMethod
public void getResult(ITestResult result){
	
	 String testname=result.getName();
	 System.out.println("name of the test is:"+testname);
	 System.out.println("parameters :"+result.getParameters()[0]);
	int resultstatus= result.getStatus();
	System.out.println("status of result is:"+resultstatus);
	if(resultstatus==2){
		File outfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //converting driver object to takescreenshot object this is called type casting in java
		try {
			FileUtils.copyFile(outfile, new File("C:\\Takescreenshot\\getscreenshot.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	 
}
