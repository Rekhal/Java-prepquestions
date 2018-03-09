package selenium;

import org.testng.annotations.*;

public class CheckparametersinTestNG {/* once you write program here go to TestsuiteParameters.xml and run the application instead of running standalone application*/

	@Parameters({"username","password"})/*username,password should be same as in TestsuiteParameters.xml file*/
	@Test
	public void checkparameter(String user_name,String pass_word){
		
		System.out.println("value of username is:"+user_name);
		System.out.println("value of password is:"+pass_word);
	}
	
	
	
}
