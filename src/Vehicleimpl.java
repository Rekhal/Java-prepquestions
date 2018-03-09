
public class Vehicleimpl implements vehicle{
	

	public static void main(String[] args) {
		Vehicleimpl v=new Vehicleimpl();
		v.start();
		v.age();
		v.model();

	}

	
	public void start() {
		System.out.println("start..method");
		
	}

	
	public void age() {
		System.out.println("Age of car is:"+ageofcar);
		
	}

	
	public void model() {
		
		System.out.println("model of car is:"+model);
		
	}

}
