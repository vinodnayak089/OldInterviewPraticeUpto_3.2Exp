package com.pratice.interviews;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 4,34,3,65,8,2 };
		usingSingleLoop(arr);
		// usingTwoForLoop(arr);
	}

	private static void usingTwoForLoop(int[] arr) {

		int temp = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println("usingTwoForLoop min :" + arr[0]);
		System.out.println("usingTwoForLoop second min :" + arr[1]);

	}

	private static void usingSingleLoop(int[] arr) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, secondMax = Integer.MIN_VALUE,
				secondMin = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			// System.out.println("in for loop the number is :"+arr[i]);
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			if (arr[i] > secondMax && max != arr[i]) {
				secondMax = arr[i];
			}
			if (arr[i] < min) {
				secondMin = min;
				min = arr[i];
			}
			if (arr[i] < secondMin && arr[i] != min) {
				secondMin = arr[i];
			}

		}

		System.out.println("max :" + max);
		System.out.println("min :" + min);
		if (secondMax == Integer.MIN_VALUE) {
			System.out.println("No Second Max Value Available");
		} else
			System.out.println("second Max :" + secondMax);
		if (secondMin == Integer.MAX_VALUE) {
			System.out.println("No Second Min Value Available");
		} else
			System.out.println("second min :" + secondMin);

	}

}
