package com.oops.practice;

public class box {
    int length;
    int breadth;
    int height;
    box(int l,int b,int h){
    	length=l;
    	breadth=b;
    	height=h;
    }
    box(int x){
    	length=x;
    	breadth=x;
    	height=x;
    	System.out.println("all value are same");
    }
	public static void main(String[] args) {
		box b1=new box(1,2,3);
		b1.display();
		box b2=new box(5);
		b2.display();
		
		// TODO Auto-generated method stub

	}
	 void display() {
		// TODO Auto-generated method stub
		System.out.println("cube= "+(length*breadth*height));
	}

}
