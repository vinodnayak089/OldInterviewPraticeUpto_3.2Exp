package com.pratice.interviews;

import java.util.Arrays;
import java.util.List;

public class FindPrimeNumberUsingList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 45, 8, 7, 21, 22);
		System.out.println("numbers are : " + list);
		int num = 23;
		boolean bol = true;
		for (int i = 2; i < num; i++) {
			// int num=list.get(i);
			if (num % i == 0)
				bol = false;
		}
		if (bol == true)
			System.out.println("It is prime ");
		else
			System.out.println("It is not prime ");

	}
}
