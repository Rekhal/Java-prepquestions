
public class Instancevariables {
int puppyage;
public Instancevariables(String name){
	
	System.out.println("Name of Puppy is:"+name );
}
public void setage(int age){
	puppyage=age;
}
public int getage(){
	System.out.println("age of puppy is:"+puppyage);
	return puppyage;
}
public static void main(String[] args){
	Instancevariables mypuppy=new Instancevariables("tommy");
	mypuppy.setage(2);
	mypuppy.getage();
	System.out.println("variable value is:"+mypuppy.puppyage);
}
}