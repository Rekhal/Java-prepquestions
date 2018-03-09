import java.io.*;
import java.util.Scanner;

public class emptest  {

static String name;
static int age;
static String designation;
static double sal;
static Scanner emp1=new Scanner(System.in);
static Scanner emp2=new Scanner(System.in);

public static void main(String[] args) {
		
	    
	
	System.out.println("Enter the name of emp1:");
	 name=emp1.next();
	
    
	System.out.println("Enter the age of the emp1:");
	 age=emp1.nextInt();
	
	System.out.println("Enter the designation of emp1:");
	 designation=emp1.next();
	
	
	System.out.println("Enter the salary of emp1:");
	double sal=emp1.nextDouble();
	if(sal>=120000){
		System.out.println("Employee eligible for promotion");
	}else if(sal<120000){
		System.out.println("Employee not eligible for Promotion");
	}
		
	System.out.println("Enter the name of the emp2:");
	name=emp2.next();
	
	
	System.out.println("Enter the age of the emp2:");
	age=emp2.nextInt();
	
	
	System.out.println("Enter the designation of emp2:");
	designation=emp2.next();
	
	System.out.println("Enter the salary of emp2:");
	sal=emp2.nextDouble();	
	
	if(sal>=110000){
		System.out.println("Employee eligible for promotion");
	}else if(sal<10000){
		System.out.println("Employee not eligible for Promotion");
	}
	
}	
}


