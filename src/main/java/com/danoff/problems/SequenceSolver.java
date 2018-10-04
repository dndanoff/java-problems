package com.danoff.problems;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SequenceSolver {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int n = 5;
		
		AtomicInteger index = new AtomicInteger(1);
		IntStream.iterate(a + b, s -> s + (int) Math.pow(2, index.getAndIncrement()) * b).limit(n).forEach(System.out::println);
	}
}
