package com.recursion.methods;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
		System.out.println(" "+display(n));
		for(int i=0;i<=n;i++) {
			System.out.print(" "+display(i));
		}
		

	}
	static int display(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		return display(n-1)+display(n-2);
	}

}
