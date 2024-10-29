package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		
		dog.setName("Panther");
		dog.showName();
		dog.makeSound();
		
		
		cat.setName("Coffee");
		cat.showName();
		cat.makeSound();
		
	}

}
