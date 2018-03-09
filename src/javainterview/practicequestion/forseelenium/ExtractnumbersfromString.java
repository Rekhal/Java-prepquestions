package javainterview.practicequestion.forseelenium;

public class ExtractnumbersfromString {
	
	public static void extractnumbers(){
	
	String str="123ABC";
	str=str.replaceAll("[^0-9]", "");
	System.out.println("After trimming the numbers are:"+str);

	
	}

	public static void main(String[] args) {
		extractnumbers();
		

	}

}
