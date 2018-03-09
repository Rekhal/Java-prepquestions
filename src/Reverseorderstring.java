
public class Reverseorderstring {

	public static void main(String[] args) {
		String s="rekha";
		StringBuffer s1=new StringBuffer(s);
		String rev=s1.reverse().toString();
		
		System.out.println("reverse order of string is:"+rev);
		s.length();
		System.out.println("length of string is:"+s.length());
		
		System.out.println("after replacing the chars:"+s.replace("r", "z"));
		

	}

}
