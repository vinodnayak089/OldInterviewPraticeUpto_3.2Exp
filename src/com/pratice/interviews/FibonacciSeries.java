package com.pratice.interviews;

import java.util.Scanner;

public class FibonacciSeries {
	
	static int a=0,b=1,c;	


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter input number");
		System.out.println();
		
		int n=sc.nextInt();
		System.out.print(a +" "+b);
		//usingForLoop(n);
		usingRecursion(n);
	}

	private static void usingRecursion(int n) {

        	if(n>=1) {
        		c=a+b;
        	System.out.print(" "+c);
        	a=b;
        	b=c;
        	usingRecursion(n-1);
        	}
	}

	private static void usingForLoop(int n) {

		int a = 0,b = 0,c=0;
		for(int i=1;i<=n;i++)
		{
			if(i==1) {
				a=0;
				System.out.println(0);
				continue;
			}
			if(i==2) {
				b=1;
				System.out.println(1);
				continue;
			}
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
