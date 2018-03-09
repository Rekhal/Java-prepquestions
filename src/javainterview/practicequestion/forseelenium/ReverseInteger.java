package javainterview.practicequestion.forseelenium;

public class ReverseInteger {

	public static void main(String[] args) {
		int n=2345,rev=0,res;
		while(n!=0){
			res=n%10;
			rev=(rev*10)+res;
			n=n/10;
			
		}
		
		System.out.println("Reverse of number is :"+rev);

	}

}
