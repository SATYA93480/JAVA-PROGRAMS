package com.oops.practice;
 class Animal99{
	public void sound() {
		System.out.println("animal sound");
	}

	
}
 class dog99 extends Animal99{
	 @Override
	public void sound() {
		System.out.println("dog sound");
	}
	public void eat() {
		System.out.println("dog is barking");
	}
	
}
class puppy1 extends dog99{
	@Override
	public void sound() {
		System.out.println("puppy sound");
	}
	public void cry() {
		System.out.println("puppy crying");
	}
}

public class test99 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upCasting
		Animal99 a=new dog99();
		a.sound();
//		a.bark();
		//downCasting
		dog99 d=(dog99) a;
		d.sound();
//		d.bark();
		Animal99 s=new puppy1();
		s.sound();
//		s.cry();
		puppy1 p=(puppy1) s;
		p.sound();
		p.cry();
		
        
	}

}

