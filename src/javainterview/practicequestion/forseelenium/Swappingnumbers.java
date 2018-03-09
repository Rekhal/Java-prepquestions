package javainterview.practicequestion.forseelenium;

public class Swappingnumbers {
	
	public static void swapwithtemp(){
		int x=9,y=7;
				
		int temp=0;//using 3rd variable we are swapping 
		
		temp=x;
		x=y;
		y=temp;
		
		
		System.out.println("value of x is:"+x);
		System.out.println("value of y is :"+y);
		
	}
	
	public static void swapwithouttemp(){
		
		int x=10;
		int y=20;
		x=x+y;//x=30
		y=x-y;//y=30-20,y=10
		x=x-y;//x=30-10 ,x=20
		
		System.out.println("value of x is :"+x);
		System.out.println("value of y is :"+y);
	}

	public static void main(String[] args) {
		swapwithtemp();
		swapwithouttemp();

	}

}
