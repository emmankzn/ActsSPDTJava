package abstractionwinterface;

public class Bird implements Animal, AirAnimal{

	final String name = "Birdy";
	
	void showName() {
		System.out.println("Name : " + name);
	}
	
	
	public void makeSound() {
		System.out.println("Twit Twit");
	}
	
	public void fly() {
		System.out.println("I can fly high");
	}

	public void run() {
		System.out.println("I can run");
	}
	
	public void walk() {
		System.out.println("I can walk");
	}
	
	
}
