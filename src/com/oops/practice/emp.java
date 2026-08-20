package com.oops.practice;

public class emp {
	int id;
	String name;
	private static int num=101;
	emp(String n){
		id=num++;
		name= n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 emp e1 = new emp("satya");
		 e1.display();
		 emp e2=new emp("nath");
		 e2.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+name);
	}



}
