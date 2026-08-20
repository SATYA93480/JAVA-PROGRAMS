package com.oops.practice;
abstract class vehicle{
	String brand;
	public vehicle(String brand) {
		this.brand=brand;
	}
}
class bike extends vehicle{
	public bike() {
		super("himalayan");
		System.out.print("bullet \t");
	}
	void dsiplay() {
		System.out.println(brand);
	}
}
public class test7 {
      public static void main(String[] args) {
		bike b=new bike();
		b.dsiplay();
	}
}
