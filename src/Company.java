package com.lab4com.revesion;

public class Company {

	 public static void main(String[] args) {
		 
	        //TODO:declare and create 3 objects(as a employee1,2,3) and set params
		 	Employee employee1 = new Employee("John", "Trader", "BNP Paribas", 3000.0);
		 	double a = employee1.getSalary();
		 	Employee employee2 = new Employee("Peter", "Analyst", "BNP Paribas", 3500.0);
		 	double b = employee2.getSalary();
		 	Employee employee3 = new Employee("Anna", "Finance manager", "BNP Paribas", 4000.0);
		 	double c = employee3.getSalary();
	        //TODO:set department for your employees
		 	employee1.setDepartment("Sales & Trading");
		 	
		 	employee2.setDepartment("Investment Banking");
		 	
		 	employee3.setDepartment("Accounting ");
		 	
	        System.out.println("After 1 year inside the company:");
		 
	        //TODO:set to change your employee promotion from position to salary
	        employee1.setPosition("Head of Trading");
	        employee1.setSalary(10000.0);
	        
	        employee2.setPosition("Director");
	        employee2.setSalary(15000.0);
	        
	        employee3.setPosition("Sales auditor � finances");
	        employee3.setSalary(8000.0);
		 
	        //TODO:calculate employees salary difference after 1 year
	        double a_a = employee1.getSalary();
	        double diffSal1 = a_a-a;
	        
	        double b_b = employee2.getSalary();
	        double diffSal2 = b_b-b;
	        
	        double c_c = employee3.getSalary();
	        double diffSal3 = c_c-c;
	        
	        //out print your employees
	        System.out.println(employee1);
	        System.out.println(employee2);
	        System.out.println(employee3);
	        
	        System.out.println("The employee with id="+ employee1.getId() + " salary difference after 1 year: " +diffSal1);
	        System.out.println("The employee with id="+ employee2.getId() + " salary difference after 1 year: " +diffSal2);
	        System.out.println("The employee with id="+ employee3.getId() + " salary difference after 1 year: " +diffSal3);
	 		}
	}