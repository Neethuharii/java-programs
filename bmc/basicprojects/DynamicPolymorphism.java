package com.basicprojects;

class Vehicle{
	public void move() {
		System.out.println("to travel");
	}}
	class Car extends Vehicle{
		
	}
	class Jeep extends Vehicle{
		
	}

public class DynamicPolymorphism {

	public static void main(String[] args) {
	Vehicle v=new Car();
	v.move();
	v=new Jeep();
	v.move();
	}

}
