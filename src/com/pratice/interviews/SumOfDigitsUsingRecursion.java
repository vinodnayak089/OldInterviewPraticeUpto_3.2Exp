package com.pratice.interviews;

public class SumOfDigitsUsingRecursion {

	public static void main(String[] args) {


		System.out.println(	SumOfDigitsUsingRecursion.sumOfDigits(213));
	}
	
	public static int sumOfDigits(int num)
	{
	    if(num==0)
	        return 0;
	    else
	    return num%10 +sumOfDigits(num/10);
	}

	}


