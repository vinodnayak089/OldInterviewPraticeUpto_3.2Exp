package com.pratice.interviews;

public class StringReverseOrder {

	public static void main(String[] args) {
		// 6) Print the string in reverse order?

		String str = "Vinod";
		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n=====");
		reverse();

	}

	public static void reverse() {
		StringBuffer input1 = new StringBuffer("Vinod");
		input1.reverse();
		System.out.println(input1);
	}

}
