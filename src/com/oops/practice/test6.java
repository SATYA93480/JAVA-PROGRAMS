package com.oops.practice;

public class test6{
	public static void main(String args[]) {
		AC ac1=new AC();
		System.out.println("current temperature of ac1 = "+ac1.temp);
		ac1.inctemp();
		ac1.inctemp();
		System.out.println("Current temperature for AC = "+ac1.temp);
	}
}

