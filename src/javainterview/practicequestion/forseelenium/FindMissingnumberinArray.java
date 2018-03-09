package javainterview.practicequestion.forseelenium;

public class FindMissingnumberinArray {

	public static void main(String[] args) {
		int a[]={-3,-1,0,1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.println("sum of numbers is "+sum);
		
		int sum1=0;
		for(int j=-3;j<=8;j++){//you have to initialize the value of j according to starting number(-3) and ending number of array(8) defined at the start 
			sum1=sum1+j;
		}
		
		System.out.println("sum of numbers is :"+sum1);
		
		int res=sum1-sum;
		System.out.println("Misssing number is :"+res);

	}

}
