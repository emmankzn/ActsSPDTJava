package main;

public class Toddler extends Person{

	
	String favoriteFood;

	Toddler(String name, String sex, int age, String favoriteFood){
		super(name, sex,  age);
		
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.favoriteFood = favoriteFood;
		
	}
	
	void checkStatus() {
		super.checkStatus();
		
		System.out.println("Favorite Food:" + favoriteFood);
	}
	
}
