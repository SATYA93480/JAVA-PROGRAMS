package com.oops.practice;
class Address implements Cloneable{
	String city;
	public Address(String city) {
		this.city=city;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
public class Employee implements Cloneable {
	int id;
	Address address;
	Employee(int id,Address address){
		this.id=id;
		this.address=address;
	}
    
	@Override
	public Object clone() throws CloneNotSupportedException{
		Employee emp=(Employee) super.clone();
		
		emp.address=(Address) address.clone();//deep cloning if i remove this line it will be shallow cloning
		return emp;
	}
	   public static void main(String[] args) throws CloneNotSupportedException {

	        // Original object
	        Address a1 = new Address("Bhubaneswar");
	        Employee e1 = new Employee(101, a1);

	        // Clone
	        Employee e2 = (Employee) e1.clone();

	        // Print values
	        System.out.println("Original Employee:");
	        System.out.println("ID: " + e1.id);
	        System.out.println("City: " + e1.address.city);

	        System.out.println();

	        System.out.println("Cloned Employee:");
	        System.out.println("ID: " + e2.id);
	        System.out.println("City: " + e2.address.city);

	        System.out.println();

	        // Check whether Address objects are different
	        System.out.println("Same Address object  ? " + (e1.address == e2.address));
	    }
	}

