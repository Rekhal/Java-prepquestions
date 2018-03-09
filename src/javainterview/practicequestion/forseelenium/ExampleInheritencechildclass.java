package javainterview.practicequestion.forseelenium;

public class ExampleInheritencechildclass extends ExampleInheritencebaseclass{

	public static void main(String[] args) {
		
		ExampleInheritencechildclass e=new ExampleInheritencechildclass();
		e.start();
		e.wheels();
		e.theftsafety();
		e.stop();
		e.stopbmw();
		
		
	}
	
	public void start(){
		super.start();//if the base class and child class has same method names  by default preference will be given to 
		//child class methods this is called method overriding in order to access the base class method start use super keyword and access the method
		System.out.println("start bmw");
	}
	
	public void theftsafety(){
		System.out.println("BMW has theft safety");
		
	}
	
	public void stopbmw(){
		System.out.println("BMW car has stopped");
		
	}

}
