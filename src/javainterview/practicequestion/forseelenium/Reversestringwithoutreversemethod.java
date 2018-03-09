package javainterview.practicequestion.forseelenium;

public class Reversestringwithoutreversemethod {

	public static void main(String[] args) {
		String s="Hello world";
		int i=s.length();
		StringBuffer sb=new StringBuffer();
		for(int j=i-1;j>=0;j--){
			sb=sb.append(s.charAt(j));
		}
		System.out.println("Reverse order of string is:"+sb);

}
}