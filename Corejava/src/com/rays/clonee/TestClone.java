package com.rays.clonee;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new  Address();
		a.setCity("indore");
		a.setState("madhya pradesh");
		
		
		Employee e = new Employee();
		e.setAddress(a);
		e.setId(243);
		e.setName("sourabh");
		
		
		Employee e1 = (Employee) e.clone();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress().getCity());
		System.out.println(e.getAddress().getState());

		
		System.out.println("----------------------");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e.getAddress().getCity());
		System.out.println(e1.getAddress().getState());
	
	
		
		
	}

}
