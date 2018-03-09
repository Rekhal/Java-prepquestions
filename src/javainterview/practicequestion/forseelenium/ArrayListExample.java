package javainterview.practicequestion.forseelenium;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(0, "23");
		arr.add(1, "Hello");
		arr.add(2, "java");
		arr.add(3, "g");
		
		System.out.println("length of arraylist is:"+arr.size());
		System.out.println("value in second index is:"+arr.remove(2));
		System.out.println("length of arraylist is:"+arr.size());
		
		EmpclassforArrayList e1=new EmpclassforArrayList("Rekha", 36, "QA");
		EmpclassforArrayList e2=new EmpclassforArrayList("Tavish",9,"Wyatt");
		EmpclassforArrayList e3=new EmpclassforArrayList("Lahar",4,"kidz");
		
		ArrayList<EmpclassforArrayList> a1=new ArrayList<EmpclassforArrayList>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		Iterator<EmpclassforArrayList> it1=a1.iterator();
		while(it1.hasNext()){
			EmpclassforArrayList e=it1.next();
			System.out.println("emp name is:"+e.name);
			System.out.println("emp age is:"+e.age);
			System.out.println("emp dept is:"+e.dept);
		}
		
		 
		
		

	}

}
