package com.oops.practice;
interface paymenti3{
	void pay();
	default void receipt() {
		System.out.println("receipt generated");
	}
	static void info() {
		System.out.println("online payment");
	}
}
class  Gpay implements paymenti3{
	public void pay() {
		System.out.println("pay through gpay");
	}
}
public class testi3 {
	public static void main(String[] args) {
		paymenti3 p=new Gpay();
		p.pay();
		p.receipt();
		paymenti3.info();
	}

}
