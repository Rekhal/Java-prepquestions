package selenium;

import org.testng.annotations.*;

public class Checkparamwithoptionalannotation {
	
	@Parameters({"Username","password"})
	@Test
	public void checkparamoptional(@Optional("selenium")String user_name,String passwordvalue){
		System.out.println("value os username is :"+user_name);
		System.out.println("value of password is :" +passwordvalue);
		
	}
	

}
