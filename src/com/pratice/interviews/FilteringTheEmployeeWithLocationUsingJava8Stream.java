package com.pratice.interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringTheEmployeeWithLocationUsingJava8Stream {

	public static void main(String[] args) {

		// List emp; id, name, city
		List<Employee1> list = new ArrayList<>();
		Employee1 emp1 = new Employee1("VinodPune", "pune");
		Employee1 emp2 = new Employee1("VinodHyd", "hyd");
		Employee1 emp3 = new Employee1("VinodBlr", "blr");
		Employee1 emp4 = new Employee1("VinodChennai", "chennai");

		list.add(emp1);
		list.add(emp2);

		List<Employee1> empPune = list.stream().filter(e -> e.city == "hyd" || e.city == "pune")
				.collect(Collectors.toList());

		System.out.println(empPune);

	}
}

class Employee1 {
	String city;
	String name;

	Employee1(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return name + " " + city;
	}
}
