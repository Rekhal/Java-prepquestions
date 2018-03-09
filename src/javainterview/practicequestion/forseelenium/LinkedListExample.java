package javainterview.practicequestion.forseelenium;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Rekha");
		ll.add("Bank OfAmerica");
		ll.add("Selenium");
		System.out.println("length of linkedlist is :"+ll.size());
		for(int i=0;i<ll.size();i++){
			System.out.println("reading contents in linkedlist:"+ll.get(i));
		}
		
		ll.addFirst("Java");
		ll.addLast("cucumber");
		Iterator<String> str=ll.iterator();
		while(str.hasNext()){
			System.out.println("***********Reading the contents using Iterator:"+str.next());
		}

	}

}
