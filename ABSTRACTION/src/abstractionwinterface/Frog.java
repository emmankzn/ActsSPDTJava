package abstractionwinterface;

public class Frog implements Animal,WaterAnimal,LandAnimal{

	final String name = "Fropy";
	
	void showName() {
		System.out.println("Name : " + name);
	}
	
	public void makeSound() {
		System.out.println("KOKAK!");
	}
	
	public void swim() {
		System.out.println("I can swim");
	}
	
	public void run() {
		System.out.println("I can run");
	}
	
	public void walk() {
		System.out.println("I can walk");
	}
}
