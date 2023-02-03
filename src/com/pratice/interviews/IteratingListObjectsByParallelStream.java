package com.pratice.interviews;

import java.util.Arrays;
import java.util.List;

public class IteratingListObjectsByParallelStream {

	public static void main(String[] args) {

		// 4) Iterating the listObjects by Parallel stream?
		List<Integer> l = Arrays.asList(1, 2, 2, 4, 5);
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		l.stream().forEach(x -> System.out.println("Current Thread is :" + Thread.currentThread().getName()));
		end = System.currentTimeMillis();
		System.out.println("Parallel taken time :" + (end - start));

		// Using Parallel Streams
		start = System.currentTimeMillis();
		l.parallelStream().forEach((x) -> System.out.println(
				"Parallel Stream current Thread is : " + Thread.currentThread().getName() + " for value :" + x));
		end = System.currentTimeMillis();
		System.out.println("Parallel taken time :" + (end - start));
	}

}
