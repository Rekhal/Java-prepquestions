package javainterview.practicequestion.forseelenium;
import java.util.Scanner;

public class comparetwonum {
static int a=0,b=0;
static Scanner obj=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter first number:");
		a=obj.nextInt();
		System.out.println("Enter second number:");
		b=obj.nextInt();
		if (a==b){
			System.out.println("both numbers are equal");
		}else if(a>b){
			System.out.println("FirstNumber is greater");
		}else if(a<b){
			System.out.println("secondNumber is greater");
		}

	}

}
