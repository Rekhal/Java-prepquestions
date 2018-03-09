package javainterview.practicequestion.forseelenium;

public class singletonconcept {
	
	private static singletonconcept singletoninstance=null;
	public String str;
	
	private singletonconcept(){
		str="This is selenium with java";
		
		
	}
	
	public static singletonconcept getInstance(){
		if(singletoninstance==null){
			singletoninstance=new singletonconcept();
			
		}
		
		return singletoninstance;
		
		
	}

	public static void main(String[] args) {
		
	singletonconcept x=singletonconcept.getInstance();
	singletonconcept y=singletonconcept.getInstance();	
	singletonconcept z=singletonconcept.getInstance();
	
	x.str = (x.str).toUpperCase();
	
	System.out.println("after converting string is:"+x.str);
	System.out.println("after converting string is:"+y.str);
	System.out.println("after converting string is:"+z.str);

	}

}
