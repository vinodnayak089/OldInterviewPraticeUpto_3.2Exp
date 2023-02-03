package com.ms1.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class FindingTargetNumberInSingleLoop {

	public static void main(String[] args) {

		int[] num = { 2, 7, 2, 3, 6, 5, 15, 3, 11, 4 };
		int target = 9;
		UsingSingleForLoopHashMap(num, target);
		// UsingTwoForLoop(num, target);
	}

	private static void UsingSingleForLoopHashMap(int[] num, int target) {

		int complement;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			complement = target - num[i];
			if (map.containsValue(complement)) {
				System.out.println("UsingSingleForLoopHashMap : " + complement + " " + num[i]);
			} else
				map.put(i, num[i]);
		}

	}

	private static void UsingTwoForLoop(int[] num, int target) {

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					System.out.println("UsingTwoForLoop These two number at index " + i + " " + j + " " + num[i] + "+"
							+ num[j] + " sum is :" + target);
				}
			}
		}
	}

}
