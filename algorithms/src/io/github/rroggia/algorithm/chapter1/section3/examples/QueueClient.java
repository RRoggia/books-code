package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.List;

public class QueueClient {
	public static void main(String[] args) {
		var queue = new Queue<String>();
		var letters = "abcdefghij".split("");
		List.of(letters).forEach(s -> queue.enqueue(s));

		System.out.println(queue.isEmpty());
		System.out.println(queue.length());
		
		for( String s: queue) {
			System.out.println(s);
		}
		
		for (int i = 0; i < letters.length; i++) {
			System.out.println(queue.dequeue());
		}

		System.out.println(queue.isEmpty());
		System.out.println(queue.length());
	}
}
