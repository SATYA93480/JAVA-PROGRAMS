package com.oops.practice;
//ATM Account
//│
//├── private PIN
//├── validatePin()
//├── withdraw()
//└── checkBalance()
import java.util.Scanner;
class atm_account{
	private int PIN;
	private double Balance;
	public atm_account(int pin) {
	    PIN=pin;
	}
	public boolean validatePin(int entered_pin) {
	     return this.PIN == entered_pin;
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount <= Balance) {
			Balance-=amount;
		}
		else if(amount <=0) System.out.print("Invalid amount");
		else System.out.print("insufficient Balance");
	}
	public void deposit(double amount) {
		if(amount>0) {
			Balance+=amount;
		}
	}
	
	public double getBalance() {
		return Balance;
	}
//public void checkBalance() {
//	System.out.print("Current Balance"+Balance);
//}
}

public class ATM {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin :");
		int entered_pin=sc.nextInt();
		atm_account ac=new atm_account(3939);
		if(ac.validatePin(entered_pin)) { 
		System.out.println("Pin is Correct");
		
		ac.deposit(1000);
		ac.getBalance();
//		ac.checkBalance();

		System.out.println(ac.getBalance());
		ac.withdraw(60);
		System.out.println(ac.getBalance());
		ac.withdraw(60);
		System.out.println(ac.getBalance());
		ac.deposit(500);
		System.out.println(ac.getBalance());
		}
		else System.out.println("Incorrecct PIN");
	}

}
