package com.oops.practice;
 class Singleton{

	private Singleton() {
		System.out.println("singleton class only have one object");
	}
	private static Singleton instance;
	public static Singleton getInstance() {
		if(instance == null) {
			instance=new Singleton();
		}
		return instance;
	}
	
}


public class test_singleton {
        public static void main(String[] args) {
			Singleton s1=Singleton.getInstance();
			Singleton s2=Singleton.getInstance();
			System.out.println(s1==s2);
			
		}
}
