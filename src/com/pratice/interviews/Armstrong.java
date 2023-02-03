package com.pratice.interviews;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt(); 
        int temp=num; 
        int result=0;
        int cube=0;
        while(temp!=0)
        {
        	cube=temp%10;
        	result=result+cube*cube*cube;
        	temp=temp/10;
        }
        if(result==num)
        {
        	System.out.println("It is Armstrong number");
        }
        else System.out.println("It is not Armstrong number");
	}

}
