package javainterview.practicequestion.forseelenium;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(0, "java");
		h.put(1, "selenium");
		h.put("string", "sel");
	System.out.println("size of hashtable is:"+h.size());
	System.out.println("value of key is:"+h.get(1));

	}

}
