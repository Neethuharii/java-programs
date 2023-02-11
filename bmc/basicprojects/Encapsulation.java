package com.basicprojects;

class Mobile {
	private String make;
	private String color;
	private int price;

	public Mobile(String make,String color,int price) {
		this.make=make;
		this.color=color;
		this.price=price;
				
	}
	public String getmake() {
		return make;

	}

	public void setmake(String make) {
		this.make = make;
	}

	public String getcolor() {
		return color;

	}

	public void setcolor(String color) {
		this.color = color;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public void makecall() {
		System.out.println("we can call using the mobile phone");
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Mobile m = new Mobile("realme","black",12000);
		//m.setmake("realme");
		//m.setcolor("black");
		//m.setprice(14000);
		System.out.println(m.getmake());
		System.out.println(m.getcolor());
		System.out.println(m.getprice());
m.makecall();
	}

}
