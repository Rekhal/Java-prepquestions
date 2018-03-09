package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Seltest1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String Title=driver.getTitle();
		System.out.println("The title of the Page is: "+Title);
		driver.manage().window().maximize();
		driver.close();
		

	}

}
