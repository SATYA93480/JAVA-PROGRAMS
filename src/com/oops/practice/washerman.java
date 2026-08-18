package com.oops.practice;
interface washable{
	
}
class bike implements washable{
	
}
class car implements washable{
	
}
class laptop{
	
}
class tv{
	
}

public class washerman {
public static void wash(Object o) {
	if(o instanceof washable) System.out.println(o.getClass().getSimpleName()+"is washable");
	else  System.out.println(o.getClass().getSimpleName()+"is washable");
	
}
public static void main(String[] args) {
	wash(new car());
	wash(new laptop());
	wash(new bike());
	wash(new tv());
}
}
