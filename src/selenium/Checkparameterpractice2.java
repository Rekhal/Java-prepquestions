package selenium;

import org.testng.annotations.*;

public class Checkparameterpractice2 {

	@Test
	@Parameters({"username","password"})
	public void checkparam(String user_name,String passwd){
	
		System.out.println("username is :"+user_name);
		System.out.println("password is:"+passwd);
	}
}
