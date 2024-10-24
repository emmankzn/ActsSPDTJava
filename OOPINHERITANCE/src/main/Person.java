package main;

public class Person {

	String name,sex;
	int age;
	
	Person(String name, String sex, int age){
		
		this.name = name;
		this.sex = sex;
		this.age = age;
		
	}
	
	
	void checkStatus() {
		
		System.out.println();
		System.out.println("Name :" + name);
		System.out.println("Sex  :" + sex);	
		System.out.println("Age  :" + age);
		
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		
		return name;
		
	}
	
	
	
	
	
}
