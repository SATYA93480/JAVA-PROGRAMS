package com.oops.practice;
class drink{
	public void pack() {
		System.out.println("pack of drink");
	}
}
class vodka extends drink{
	@Override
	public void pack() {
		System.out.println("lets drink vodka");
	}
}
class rum extends drink{
	@Override
	public void pack() {
		System.out.println("lets drink rum");
	}
}
class wine extends drink{
	@Override
	public void pack() {
		System.out.println("lets drink wine");
	}	
}
class drunk_person{
	public void drunk(drink d) {
		d.pack();
	}
}

public class liquiorshop {
	public static void main(String[] args) {
		drunk_person dp=new drunk_person();
		dp.drunk(new rum());
	}

}
