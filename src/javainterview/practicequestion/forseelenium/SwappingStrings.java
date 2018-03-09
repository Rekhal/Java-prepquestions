package javainterview.practicequestion.forseelenium;

public class SwappingStrings {

	public static void main(String[] args) {
		String a="Rekha";
		String b="Tavish";
		
		System.out.println("before swapping value of a is:"+a);
		
		System.out.println("before swapping value of b is:"+b);
		
		a=a+b;//a=rekhatavish
		b=a.substring(0,a.length()-b.length() ); //b=rekha
		a=a.substring(b.length());
		
		System.out.println("After swapping value of a  is:"+a);
		
		System.out.println("After swapping value of b is:"+b);

	}

}
