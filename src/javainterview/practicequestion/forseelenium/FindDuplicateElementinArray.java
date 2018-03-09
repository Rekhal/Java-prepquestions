package javainterview.practicequestion.forseelenium;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementinArray {

	public static void main(String[] args) {
		String names[]={"Rekha","Tavish","Lahar","Lahar","Tavish"};
		//worst approach because time complexity will be o(n*n)
	/*	for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].equals(names[j])){
					System.out.println("duplicate number is:"+names[i]);
				}
			}
		}*/
		
		//second approach is using hash set,purpose of hash set is to store unique(no duplicates) values
		
		Set<String> store=new HashSet<String>();
		for(String name:names){
			if(store.add(name)==false){
				System.out.println("duplicate element is:"+name);
			}
		}

	}

}
