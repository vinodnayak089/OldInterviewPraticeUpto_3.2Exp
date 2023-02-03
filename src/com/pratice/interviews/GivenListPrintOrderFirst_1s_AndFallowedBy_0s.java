package com.pratice.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenListPrintOrderFirst_1s_AndFallowedBy_0s {

	public static void main(String[] args) {
		// 5) Print the given list 1101000101100 in order first 1's and fallowed by 0's?
		// List<Integer> list=Arrays.asList(1,1,0,1,0,0,0,1,0,1,1,0,0);
		int[] arr = { 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0 };
		segregate0and1(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	private static void segregate0and1(int[] arr) {

		int start=0;
		int end=arr.length-1;
		

		while(start<end){
			if(arr[start]!=1)
			{
				if(arr[end]!=0)
				{
					arr[start]=arr[end]-arr[start];
					arr[end]=arr[start]-arr[end];
				}
				else end--;
			}
			else start++;
			
		}
		
	}

}
