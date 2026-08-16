package com.oops.practice;
interface payment1{
	void pay();
}
class UPI1 implements payment1{
	public void pay() {
		System.out.println("pay through upi");
	}
}
class card1 implements payment1{
	public void pay() {
		System.out.println("payment through card");
	}
}
class cash1 implements payment1{
	public void pay() {
		System.out.println("payment through cash");
	}
}


public class testi {
	public static void main(String[] args) {
		payment1 p=new UPI1();
		p.pay();
		p=new card1();
		p.pay();
		
	}

}
