package com.ms1.pratice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintFirstNonDuplicateCharacter {

	// Greeks
	public static void FirstNonRepeat(String s) {

		for (int i = 0; i < s.length(); i++) {

			// System.out.println(s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1));

			if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
				System.out.println("First non-repeating character is " + s.charAt(i));
				break;
			}
		}
		return;
	}

	// Ashok IT FirstNonRepeatUsingIAndJForLoop
	public static void FirstNonRepeatUsingIAndJForLoop(String str) {
		char result;
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("FirstNonRepeatUsingIAndJForLoop Character is : " + str.charAt(i));
				break;
			}
		}

	}

	public static void main(String[] args) {
		String s = "wvilndgdkvipvxnovinfw";
		FirstNonRepeat(s);
		FirstNonRepeatUsingIAndJForLoop(s);
		FirstNonRepeatUsingLinkedHashMap(s);
	}

	// Ashok IT FirstNonRepeatUsingHashMap
	private static void FirstNonRepeatUsingLinkedHashMap(String s) {

		char c;
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}

		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("FirstNonRepeatUsingLinkedHashMap Character id : " + entry.getKey());
				break;
			}
		}
	}

}
