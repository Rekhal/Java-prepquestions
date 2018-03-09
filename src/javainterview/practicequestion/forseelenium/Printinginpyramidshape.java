package javainterview.practicequestion.forseelenium;

public class Printinginpyramidshape {
	
	public static void pyramidprint(int level){
		 
		for(int i=0;i<level;i++)
	    {
	        for(int j=0;j<level-i-1;j++)
	        {
	            System.out.print(" ");
	        }
	        for(int k=level-i;k<=level;k++)
	        {
	            System.out.print("*");
	        }
	        for(int k=level-i;k<level;k++)
	        {
	            System.out.print("*");
	        }
	        for(int j=0;j<level-i;j++)
	        {
	            System.out.print(" ");
	        }

	        System.out.print("\n");
	    }
		}
		
		/* for(int i=0;i<5;i++){
			 
			  for(int j=0;j<5-i;j++){
				  
				   
				   System.out.println(" ");
			  }
			  
			  for(int k=0;k<=i;k++){
				  
				  System.out.println("*");
			  }
			  
			  System.out.println();
		 }
		  */
	 
	 
	

	/*public static void pyramidprint(int n){
		
		int k=2*n-2;
		
		for(int i=0;i<n;i++){ //outer loop to handle number of rows in this case n
			
			for(int j=0;j<k;j++){
				
				System.out.println(" ");
				
			}
			k=k-1;
			for(int r=0;r<=i;r++){
				
				System.out.println("* ");
			}
			
			System.out.println();
		}
	}
	*/
	public static void main(String[] args) {
		
		System.out.println("Pyramid pattern in java is:");
		pyramidprint(5);

		/*int n=5;
		pyramidprint(n);*/
}
}