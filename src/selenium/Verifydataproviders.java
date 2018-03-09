package selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

public class Verifydataproviders {

	@Test(dataProvider="course_details") //we are providing the dataprovider property to @Test
	public void getcoursedetails(String coursename,int courseduration){
		System.out.println("coursename is:"+coursename);
		System.out.println("course duration is:" +courseduration);
		
	}
@DataProvider(name="course_details")
	
	public Object[][] loadcoursedetails() {
	
	
	Object[][] arraydetails=new Object[3][2];//3 rows and 2 columns
	
	arraydetails[0][0]="selenium";
	arraydetails[0][1]=new Integer(15);
	
	arraydetails[1][0]="java";
	arraydetails[1][1]=new Integer(16);
	
	arraydetails[2][0]="oracle";
	arraydetails[2][1]=new Integer(20);
	
	return arraydetails;
	

	
}
	
}



