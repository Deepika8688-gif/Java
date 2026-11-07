package com.oops;

public class EmployeeOops {
	
	int employeeid;
	String employeeName;
	double salary;

public static void main(String[]args) {
	
}
}
	
class Developer extends EmployeeOops{
	String programmingLanguage;
	void displaydetails() {
		System.out.println("employeeid:"+employeeid);
		System.out.println("employeeName:"+employeeName);
		System.out.println("salary:"+salary);
		System.out.println("programmingLanguage:"+programmingLanguage);
		
	}
	public static void main(String[] args) {
	Developer d=new Developer();
	 d.employeeid=47;
	 d.employeeName="Gathri";
	 d.salary=100000.00;
	 d.programmingLanguage="Java";
	 
	d.displaydetails();
	 
	}

}

