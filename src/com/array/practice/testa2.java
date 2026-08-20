package com.array.practice;
import java.util.*;
public class testa2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arn array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
for(int i1=0;i1<arr.length;i1++) {
	System.out.print(arr[i1]+" ");
}
		}
		
	}


