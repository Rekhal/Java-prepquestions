package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.*;



public class Southwestverifydataproviders {
WebDriver driver;

@BeforeTest
public void getbrowser(){

System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");
driver=new ChromeDriver();
		
	}
@Test(dataProvider="departarrive")
public void flighttab(String departairport,String arrivalairport) throws InterruptedException{
	
	driver.get("https://www.southwest.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	String actualtitle=driver.getTitle();
	System.out.println("current title of webpage is:"+actualtitle);
	WebElement flighttab=driver.findElement(By.cssSelector("#booking-form--flight-tab"));
	flighttab.click();
	Thread.sleep(5000);
	WebElement radiobutton=driver.findElement(By.cssSelector("#trip-type-round-trip"));
	radiobutton.click();
	Thread.sleep(5000);
	WebElement depart=driver.findElement(By.cssSelector("#air-city-departure"));
	depart.sendKeys(departairport);
	Thread.sleep(5000);
	WebElement arrival=driver.findElement(By.cssSelector("#air-city-arrival"));
	arrival.sendKeys(arrivalairport);
	Thread.sleep(5000);
	WebElement departdate=driver.findElement(By.cssSelector("#air-date-departure"));
	departdate.click();
	WebElement calenderdatedepartpick=driver.findElement(By.cssSelector("#calendar-february-26"));
	calenderdatedepartpick.click();
	Thread.sleep(5000);
	WebElement arrivaldate=driver.findElement(By.cssSelector("#air-date-return"));
	arrivaldate.click();
	WebElement calenderdatearrivalpick=driver.findElement(By.cssSelector("#calendar-march-1"));
	calenderdatearrivalpick.click();
	Thread.sleep(5000);
	WebElement noofadults=driver.findElement(By.cssSelector("#air-pax-count-adults"));
	noofadults.click();
	Thread.sleep(5000);
	WebElement noofadultsselect=driver.findElement(By.cssSelector("#jb-number-selector-more"));
	noofadultsselect.click();
	Thread.sleep(5000);
	WebElement searchbutton=driver.findElement(By.cssSelector("#jb-booking-form-submit-button"));
	searchbutton.click();
	Thread.sleep(5000);
	WebElement selectflights=driver.findElement(By.cssSelector("span[data-jb-hook='Select Flights']"));
	String actual=selectflights.getText();
	System.out.println("reading the text as:"+actual);
	String expected="Select Flights";
	if(actual.equals(expected)){
		System.out.println("Test is passed");
	}else{
		System.out.println("Test is failed");
	}
	System.out.println("Depart airport is:"+departairport);
	System.out.println("Arrival airport is:"+arrivalairport);
	
	
	Thread.sleep(50000);
}

	

@DataProvider(name="departarrive")
public Object[][] roundtrip(){
	Object[][] departarrivetextbox=new Object[2][2];
	
	departarrivetextbox[0][0]="DAL";
	departarrivetextbox[0][1]="LAX";
	
	departarrivetextbox[1][0]="HOU";
	departarrivetextbox[1][1]="LAX";
	
	
	return departarrivetextbox;
}

@AfterMethod
public void getResult(ITestResult result){
	String nameofTest=result.getName();
	System.out.println("Name of the Test is:"+nameofTest);
	System.out.println("parameters passed are:"+result.getParameters()[0]);
	System.out.println("parameters passed are:"+result.getParameters()[1]);
	int getstatus=result.getStatus();
	System.out.println("Status of the  test  is:"+getstatus);
	
	if(getstatus==2){
		File outputfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(outputfile, new File("C:\\Takescreenshot\\screenshotforsouthwest.jpeg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

}
