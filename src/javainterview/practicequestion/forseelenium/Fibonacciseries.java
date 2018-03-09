package javainterview.practicequestion.forseelenium;

public class Fibonacciseries {
	
	public static void fibonacci(){
		int count=10;
		int fib[]=new int[count];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<count;i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		for(int i=0;i<count;i++){
			
			System.out.println("fibonacci series are :"+fib[i]+ "\t ");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		fibonacci();

	}

}
