package javainterview.practicequestion.forseelenium;
import java.util.Arrays;

public class FindLargestSmallestNumbersinArray {

	public static void main(String[] args) {
		int numbers[]={23,56,89,34,56,67,34};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>largest)
				largest=numbers[i];
			else if(numbers[i]<smallest){
				smallest=numbers[i];
				
			}
			
		}
		
		System.out.println("Given numbers in array are:"+Arrays.toString(numbers));
		System.out.println("Largest number is :"+largest);
		System.out.println("smallest number is:"+smallest);
	}

}
