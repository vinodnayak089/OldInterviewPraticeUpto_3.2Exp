package com.pratice.interviews;

import java.util.HashMap;
import java.util.Map.Entry;

public class Occurence_Of_Character_dynamically {

	public static void main(String[] args) {

		String str = "VinodVin";
		// HashMap char as a key and occurrence as a value
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			} else
				map.put(str.charAt(i), 1);
		}
		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
