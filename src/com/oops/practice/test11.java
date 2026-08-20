package com.oops.practice;
class animal1{
	public void sound() {
		
		System.out.print("animal sound");
	}

}
class dog11 extends animal1{
//	@Override
	public void sound() {
		System.out.println("bhow bhow");
	}
	public void eat() {
		System.out.print("dog will eat");
	}
	
}
public class test11 {
	public void makesound(animal1 a) {
		a.sound();
	}
	public static void main(String[] args) {
		animal1 a= new dog11();
		a.sound();
		animal1 b=new animal1();
		makesound(b);
	
	
		
	}

}
