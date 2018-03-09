package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifyselect {

	public static void main(String[] args) {
		verifyselectmethod();
		//facebookselect();
	}
		public static void verifyselectmethod(){
			WebDriver driver=new FirefoxDriver();
			driver.get("http://the-internet.herokuapp.com/dropdown");
			WebElement dropdown=driver.findElement(By.cssSelector("#dropdown"));
			
			System.out.println("user wants to verify the select Tag for downdrop?:"+dropdown.getTagName());
			Select mydropdown=new Select(dropdown);
			List<WebElement> useroptions=mydropdown.getOptions();
			System.out.println("There are options:" +useroptions.size());
			String defaulttext=mydropdown.getFirstSelectedOption().getText();
			System.out.println("The default text is:"+defaulttext);
			//mydropdown.selectByIndex(1);
			//mydropdown.selectByValue("2");
			mydropdown.selectByVisibleText("Option 1");	
			
			System.out.println("check whether first option is selected:" +useroptions.get(1).isSelected());
			
		}
		
	public static void facebookselect(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
		
		System.out.println("Check if the Firstname text area is enabled or not:"+Firstname.isEnabled());
		Firstname.sendKeys("Ramya");
		WebElement Lastname=driver.findElement(By.cssSelector("input[name='lastname']"));
		Lastname.sendKeys("sharma");
		WebElement email=driver.findElement(By.cssSelector("input[name='reg_email__']"));
		email.sendKeys("rekha_vajjha@yahoo.com");
		WebElement reenteremail=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		reenteremail.sendKeys("rekha_vajjha@yahoo.com");
		WebElement pswd=driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		pswd.sendKeys("lahar123");
		 WebElement monthdropdown=driver.findElement(By.cssSelector("#month"));
		 Select month=new Select(monthdropdown);
		 List<WebElement> getmonthoptions=month.getOptions();
		 System.out.println("The selected month options are :"+getmonthoptions.size());
		 //WebElement monthselectedoption=month.getFirstSelectedOption();
		 //System.out.println("The Firstselected option for month is:"+monthselectedoption.getText());
		 month.selectByIndex(2);
		   WebElement daydropdown=driver.findElement(By.cssSelector("#day"));
		   Select day=new Select(daydropdown);
		   List<WebElement> getdayoptions=day.getOptions();
		   System.out.println("The selected day options are :"+getdayoptions.size());
		   day.selectByIndex(2);
		   WebElement yeardropdown=driver.findElement(By.cssSelector("#year"));
		   Select year=new Select(yeardropdown);
		   List<WebElement> getyearoptions=year.getOptions();
		   System.out.println("The selected year options are :"+getyearoptions.size());
		   year.selectByIndex(20);
		   WebElement radiobutton=driver.findElement(By.cssSelector("input[value='1']"));
			radiobutton.click();
			WebElement submitbutton=driver.findElement(By.cssSelector("button[name='websubmit']"));
			submitbutton.click();
	}

	}


