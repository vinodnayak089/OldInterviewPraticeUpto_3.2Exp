package com.pratice.interviews;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Palindrome number : ");	
		int num=sc.nextInt();
		int temp=num;
		int result = 0;
		while(temp!=0)
		{
			result=result*10+temp%10;
			temp=temp/10;
		}
		if(result==num)
		System.out.println("It is Palindrome number :"+result);
		else System.out.println("The number is not Palindrome :"+result);
	}
}
