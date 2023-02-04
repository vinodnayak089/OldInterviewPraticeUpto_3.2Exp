package com.pratice.interviews;

import java.util.ArrayList;
import java.util.List;

public class FilterTheEmployeeBasedOnSalaryUsingJava8Stream {

		 public static void main(String []args){
	         List<Employee> list=new ArrayList<>();
	         Employee emp1=new Employee("vinod1",2000001);
	         Employee emp2=new Employee("vinod2",100002);
	         list.add(emp1);
	         list.add(emp2);
	         list.stream().filter(e->e.salary>(100000+(100000*25)/100)).forEach(System.out::println);
	}
}
	
	class Employee{
	    String name;
	    int salary;
	    Employee(String name, int salary)
	    {
	        this.name=name;
	        this.salary=salary;
	    }
	    
	    public String toString()
	    {
	        return name+" "+salary;
	    }
	}

