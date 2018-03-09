package javainterview.practicequestion.forseelenium;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListexample2 {
	

	public static void main(String[] args) {
		
		LinkedListEmpclassforexample2 e1=new LinkedListEmpclassforexample2("Rekha", 34, "SDET");
		LinkedListEmpclassforexample2 e2=new LinkedListEmpclassforexample2("Raju", 33, "Developer");
		
		
		LinkedList<LinkedListEmpclassforexample2> ll2=new LinkedList<LinkedListEmpclassforexample2>();
		
		
		
		ll2.add(e1);
		ll2.add(e2);
		
		
		Iterator<LinkedListEmpclassforexample2>it=ll2.iterator();
		while(it.hasNext()){
			LinkedListEmpclassforexample2 e=it.next();
			System.out.println("Reading the contents of linkedlist:"+e);
			System.out.println("Reading the name:"+e.name);
			System.out.println("Reading the name:"+e.age);
			System.out.println("Reading the name:"+e.dept);
		}
		
		
		System.out.println("size of linked list is: "+ll2.size());
		
		
	
	
	
	}
	

}
