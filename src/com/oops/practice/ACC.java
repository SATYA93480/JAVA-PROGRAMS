package com.oops.practice;
class bank_account{
	private String aname;
	private int balance;

	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
	                 }
		}
	public int getBalance() {
		return balance;
	}
}
public class ACC {
	public static void main(String[] args) {
		
		bank_account a = new bank_account();
		a.deposit(100);
		System.out.println(a.getBalance());
	}

	
}
