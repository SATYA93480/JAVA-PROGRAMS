package com.array.practice;
class student{
	String name;
	String address;
	public student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String toString() {
		return "name: "+name+"address: "+address;
	}
	
	
}

public class test2 {
	public static void main(String[] args) {
		student student[]= {
				new student("satya","soro"),
				new student("ram","ayodhya"),
				new student("krishna","dwarika"),
				new student("shiv","kailash")
		};
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
	}

}
