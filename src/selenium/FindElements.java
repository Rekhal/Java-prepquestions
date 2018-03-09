package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.*;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args)   {
		googleImages();
	}
		public static void googus()   {
			
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		//WebElement text=driver.findElement(By.cssSelector("#lst-ib"));
		//text.sendKeys("selenium");
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);//specifying timeout in seconds for webelement to be visible
		//WebElement gsearchbutton=driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/div/div/div[1]"));//using xpath
		//WebElement gsearchbutton=driver.findElement(By.cssSelector(".gbqfba.gbqfba-hvr>div>div:nth-child(3)"));//using cssselector 3rd child element 
		WebElement stellarbutton=driver.findElement(By.cssSelector(".gbqfba.gbqfba-hvr>div>div:nth-child(6)"));//using css selector 6th child element to locate
		
		//System.out.println("No of searchbuttons on the front Page:"+gsearchbutton.size());
		//for(WebElement searchbutton:gsearchbutton){
			//if(searchbutton.getText().equalsIgnoreCase("Google Search"));//clicking on google search button
			//if(searchbutton.getText().matches("I'm Feeling Lucky")){//clicking on i am feeling lucky button
				//System.out.println("Printing the text:"+searchbutton.getText() );
			
				stellarbutton.click();
				//WebElement link=driver.findElement(By.linkText("The 10 Best Plano Restaurants 2017 - TripAdvisor"));//using linkText after the restaurant page is found user needs to click on the page
				WebElement link=driver.findElement(By.linkText("Pillars in the Carina Nebula"));//using linkText after the stellar page is found user needs to click on the hyperlinkpage

				link.click();
			//break;
				//driver.close();
		}	
			

	
	

	public static void googind(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		//WebElement text=driver.findElement(By.cssSelector("#lst-ib"));
		//text.sendKeys("selenium");
		List<WebElement> languages=driver.findElements(By.cssSelector("#_eEe>a"));//using find elements instead of findelement
		System.out.println("No of searchbuttons on the front Page:"+languages.size());
		for(WebElement lang:languages){
			//if(searchbutton.getText().equalsIgnoreCase("Google Search"));
			if(lang.getText().equalsIgnoreCase("తెలుగు")){
				System.out.println("To get the language text:"+lang.getText());
			lang.click();
			break;
		}
		}	

	}
public static void gmailpage(){
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/?gws_rd=ssl");
	WebElement gmaillink=driver.findElement(By.linkText("Gmail"));
	gmaillink.click();
	WebElement signinlink=driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in"));
	signinlink.click();
	WebElement enteremail=driver.findElement(By.cssSelector("#identifierId"));
	enteremail.sendKeys("rekha.vajjha");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement Nextbutton=driver.findElement(By.id("identifierNext"));
	Nextbutton.click();
	WebElement enterpass=driver.findElement(By.cssSelector("input[name='password']"));
	System.out.println("Check whether password text area is enabled:"+enterpass.isEnabled());
	enterpass.sendKeys("tavish123");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement afterpassNextbutton=driver.findElement(By.cssSelector("#passwordNext"));
	afterpassNextbutton.click();
	WebElement logoforsignout=driver.findElement(By.cssSelector(".gb_7a.gbii"));
	logoforsignout.click();
	WebElement logoutbutton=driver.findElement(By.cssSelector("#gb_71"));
	logoutbutton.click();
	WebElement dropdown=driver.findElement(By.cssSelector(".mUbCce.fKz7Od.YYBxpf.KEavsb"));
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	dropdown.click();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement removeacct=driver.findElement(By.cssSelector(".q4UYxb"));
	removeacct.click();
		
}
	
public static void googleImages(){

	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	String title=driver.getCurrentUrl();
	System.out.println("Current title of webpage is:"+title);
	WebElement Images=driver.findElement(By.linkText("Images"));
	Images.click();
	WebElement textarea=driver.findElement(By.cssSelector("#lst-ib"));
	textarea.sendKeys("hurricane harvey");
	WebElement searchbutton=driver.findElement(By.cssSelector("#_fZl"));
	searchbutton.click();
	WebElement imgselect=driver.findElement(By.cssSelector("img[name='fuFD2PN-bwWgQM:']"));
	imgselect.click();
	WebElement visitpage=driver.findElement(By.linkText("Visit page"));
	visitpage.click();
}

}

	

