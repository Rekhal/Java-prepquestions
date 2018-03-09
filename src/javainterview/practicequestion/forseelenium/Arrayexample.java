package javainterview.practicequestion.forseelenium;

public class Arrayexample {
	
	/*public int array(){
	

	int a[]=new int[4];
	a[0]=67;
	a[1]=55;
	a[2]=69;
	a[3]=100;
	return a.length;
	}*/

	public static void main(String[] args) {
		String s[]=new String[4];
		s[0]="Hello";
		s[1]="selenium";
		s[2]="java";
		s[3]="world";
		
		
		
		int length=s.length;
	
	
		System.out.println("length of string array  is:"+length);
		System.out.println("string concatination is:"+s[0]+s[1]+s[2]+s[3]);
		for(int i=0;i<s.length;i++){
			System.out.println("Read the content of string array:"+s[i]);
		}
		
		

	}

}
