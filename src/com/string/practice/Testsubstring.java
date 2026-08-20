package com.string.practice;

public class Testsubstring {
     public static void main(String[] args) {
		String str="MALAYALAM";
		for(int i=0;i<str.length()-1;i++) {
		for(int j=i+2;j<=str.length();j++) {
			String s1=str.substring(i,j);
			if(ispallindrome(s1)) 
				System.out.println(s1);
			
		
		}
			
		}
	}

	 public static boolean ispallindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	 }

}

