package com.bmc.basicprojects;

class Animal{
	public void eat() {
		System.out.println("animal eat");
	}
}
class Dog extends Animal{
	
}
public class InheritanceTest {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
	}

}
