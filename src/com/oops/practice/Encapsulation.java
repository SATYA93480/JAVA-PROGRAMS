package com.oops.practice;
class student{
	private String name;
	private int age;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int age) {
		if(age>0) {
			this.age=age;
		}
	}
	public int getage() {
		return age;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		student s=new student();
		s.setname("baal chand");
		s.setage(18);
		System.out.println(s.getname());
		System.out.println(s.getage());
	}

}
