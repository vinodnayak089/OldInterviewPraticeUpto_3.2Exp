package com.pratice.sample.examples;

import java.util.HashMap;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number as input : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("This number will be printed from " + i + " to " + num + " : " + i);
			System.out.println();
		}
	}

}
