package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ObjectRepository {
         WebDriver driver=null;
        
	@Test
	public void commonproperties() throws IOException{
		
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream("C:\\javatests\\simple Test\\src\\selenium\\config.properties");
		prop.load(fs);
		String name=prop.getProperty("name");
		System.out.println("propertyname is :"+name);
		String age=prop.getProperty("age");
		System.out.println("Property age is :"+age);
		String browser=prop.getProperty("browsername"); 
		System.out.println("browsername is :"+browser);
		String fetchurl=prop.getProperty("URL");
	   	System.out.println("fetchedurl is: "+fetchurl);
	   
	   	if(browser.equals("chrome")){
	   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Downloads\\chromedriver\\chromedriver.exe");
	   		 driver=new ChromeDriver();
	   	}else if(browser.equals("Firefox")){
	   		driver=new FirefoxDriver();
	   	}
		
	   driver.get(fetchurl);
		
	}
}

