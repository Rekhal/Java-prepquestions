package javainterview.practicequestion.forseelenium;

public class CallByValCalbyRef {
    //call by value  
	
	int x=50;
	public  void change(CallByValCalbyRef obj ){
      obj.x=obj.x+30;
		
	}
	public static void main(String[] args) {
		CallByValCalbyRef obj=new CallByValCalbyRef();
		
		System.out.println("Value of x before is:"+obj.x);
		
		obj.change(obj);
		System.out.println("after change "+obj.x);
	}

}
