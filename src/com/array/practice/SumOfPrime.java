package com.array.practice;

public class SumOfPrime {
	public static void main(String[] args) {
		int arr[]= {2,5,10,13};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isprime(arr[i])) {
				sum+=arr[i];
				
			}
			
			
		}
		System.out.println("sum of prime number is :"+sum);
		
	}	
		
		public static boolean isprime(int n) {
			if(n<=1) return false;
			for(int i=2;i<n/2;i++) {
				
				
				if(n%i==0) return false;
				
			
			
			}
			return true;
	}


}
