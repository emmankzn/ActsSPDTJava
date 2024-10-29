package abstractionwinterface;

public class Cat implements Animal,LandAnimal{

	final String name = "Coffee";
	
	void showName() {
		System.out.println("Name : " + name);
	}
	
	public void makeSound() {
		System.out.println("meow!");
	}
	
	public void run() {
		System.out.println("I can run and clim into tree");
	}
	
	
	public void walk() {
		System.out.println("I can walk");
	}
	
}
