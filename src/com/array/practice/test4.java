package com.array.practice;
//using method sum of digit of an array
public class test4 {
      public static int SumOfDigit(int []arr) {
    	  int sum=0;
    	  for(int i=arr.length-1;i>=0;i--) {
    	    sum+=arr[i];
      }
    	  return sum;
    	  }
      public static void main(String[] args) {
		int arr[]= {10,2,30,40,50};
	}
}
