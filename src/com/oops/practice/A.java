package com.oops.practice;

public class A {
 int i;
 A(int i){
	 this.i=i;
 }
 public static void main(String[] args) {
		A a1=new A(10);
		B b1=new B();
		b1.m1(a1);
		b1.m1(new A(20));
	}
}
class B{
	void m1(A args) {
		System.out.println(args);
	}
	
}
