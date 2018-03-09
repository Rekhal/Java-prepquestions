package javainterview.practicequestion.forseelenium;

public class palindrome {
	
	public static void readpalindrome(int n){
		int temp,res,sum=0;
		temp=n;
		while(n>0){
			res=n%10;
			sum=sum*10+res;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("number is palindrome");
		}else{
			System.out.println("number is not palindrome");
		}
		
		
	}

	private static void main(String[] args) {
		int n=549;
		readpalindrome(n);
		

	}

}
