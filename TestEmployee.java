package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		
		//Accessing the  default data within the package
		//Whenever the data is private,we cannot access outside of the classes
		//CE : The field employee.eid is not visible
		Employee emp1=new Employee();
		emp1.setEid(47);
		emp1.setEname("Gathri");
		emp1.setSal(100000.00);
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getSal());
		
		// emp1.id=47;
		//emp1.ename="Gathri";
		//emp1.sal=100000.00;
		
		//System.out.println(emp1.eid);
		//System.out.println(emp1.ename);
		//System.out.println(emp1.sal);
	}

}
