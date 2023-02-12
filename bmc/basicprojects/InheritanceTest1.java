package com.basicprojects;

class Vehicle{
	public void move() {
		System.out.println("to travel");
	}
}

class Car extends Vehicle{
	
}
public class InheritanceTest1 {

	public static void main(String[] args) {
		Car c=new Car();
		c.move();
	}

}
