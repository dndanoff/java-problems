package com.danoff.problems;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubstringSolver {
	public static String getSmallestAndLargest(String s, int k) {
		List<String> sortedSubstrings = IntStream.range(0, s.length() - (k-1))
												.mapToObj(i -> s.substring(i, i + k))
												.sorted()
												.collect(Collectors.toList());

		String smallest = sortedSubstrings.get(0);
		String largest = sortedSubstrings.get(sortedSubstrings.size()-1);
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		int k = scan.nextInt();
//		scan.close();

		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}
}
