package com.pratice.interviews;

public class FindPrimeNumber1To100 {

	public static void main(String[] args) {

        for(int i=2;i<100;i++)
        {
        	int temp=0;
        	for(int j=2;j<i-1;j++)
        	{
        		if(i%j==0)
        		{
        			temp++;
        		}
        	}
        	if(temp==0)
        	{
        		System.out.println("This number will be Prime Number : "+ i);
        	}
        }
	}

}
