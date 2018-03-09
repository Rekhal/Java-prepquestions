import java.io.*;

public class emp {

	String name;
	int age;
	String designation;
	double sal;
	
	public emp(String name){
		this.name=name;
	}
	public void empage(int empage){
		age=empage;
	}
	public void empdesig(String empdesig){
		designation=empdesig;
	}
	public void printemp(){
		System.out.println("Enter the name of the Employee:" +name);
		System.out.println("Enter the age of the Employee:" +age);
		System.out.println("Enter the designation of the Employee:" +designation);
		System.out.println("Enter the salary of the Employee:" +sal);
	}
}


