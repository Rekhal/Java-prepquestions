import java.io.*;

public class Employee {
String name;
int age;
String designation;
double salary;

public Employee(String name){
	this.name=name;
}

public void empage(int empage){
	age=empage;
}
public void empdesig(String empdesig){
	designation=empdesig;
}
public void empsal(double empsal){
	salary=empsal;
}
public void printemployee(){
	System.out.println("Employee name is:"+name);
	System.out.println("Employee age is:"+age);
	System.out.println("Employee designation is:"+designation);
	System.out.println("Employee salary is:"+salary);
}

}
