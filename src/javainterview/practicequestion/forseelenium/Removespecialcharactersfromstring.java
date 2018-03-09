package javainterview.practicequestion.forseelenium;

public class Removespecialcharactersfromstring {
	
	public static void remove(){
		String s="$#@()&^%#Rekha%$##()Test&*())$#@!";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After Removing special characters from string:"+s);
	}

	public static void main(String[] args) {
		remove();

	}

}
