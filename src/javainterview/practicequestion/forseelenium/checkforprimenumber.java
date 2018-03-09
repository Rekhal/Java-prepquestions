package javainterview.practicequestion.forseelenium;

public class checkforprimenumber {
	
	public static void primecalulate(int n){
		
		if(n%2==0){
			System.out.println("This is prime no:"+n);
		}
		else{
			System.out.println("odd number:"+n);
		}
	}

	public static void main(String[] args) {
		int n=7;
		primecalulate(n);
	}

}
