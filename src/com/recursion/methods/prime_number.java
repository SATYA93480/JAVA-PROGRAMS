package com.recursion.methods;
import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		int i=n%2;
		if(isprime(n,i)) System.out.print("it is prime");
		else System.out.print("not prime");
        
	}
	static boolean isprime(int n,int i) {
		if(n<=1) return false;
		if(n>=i/2) return true;
		return isprime(n,i+1);
		
	}

}
