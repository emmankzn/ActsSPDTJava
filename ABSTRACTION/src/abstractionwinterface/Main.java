package abstractionwinterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Frog frog = new Frog();
		
		
		dog.showName();
		dog.makeSound();
		dog.run();
		dog.walk();
		
		System.out.println();
		
		cat.showName();
		cat.makeSound();
		cat.run();
		cat.walk();
		
	
		System.out.println();
		
		bird.showName();
		bird.makeSound();
		bird.fly();
		bird.run();
		bird.walk();
	
		
		System.out.println();
		
		frog.showName();
		frog.makeSound();
		frog.swim();
		frog.run();
		frog.walk();
	}

}
