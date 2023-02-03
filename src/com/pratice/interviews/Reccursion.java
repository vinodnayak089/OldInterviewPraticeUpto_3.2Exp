package com.pratice.interviews;

import java.util.Scanner;

public class Reccursion {

	public static void main(String[] args) {

		System.out.println("Enter which factorial number you want : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("number is :"+n);
		int result=fact(n);
		System.out.println("Factorial is : "+result);
	}

	private static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}

}
