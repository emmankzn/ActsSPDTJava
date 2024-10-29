package abstractionwinterface;

public class Dog implements Animal,LandAnimal{

	final String name = "Panther";
	
	void showName() {
		System.out.println("Name : " + name);
	}
	public void makeSound() {
		System.out.println("Arf arf");
	}
	
	public void run() {
		System.out.println("I can run faster!");
	}
	public void walk() {
		System.out.println("I can walk");
	}
	
	
	
}
