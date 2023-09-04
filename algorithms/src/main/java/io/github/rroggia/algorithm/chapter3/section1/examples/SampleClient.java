package io.github.rroggia.algorithm.chapter3.section1.examples;

import java.util.Arrays;

public class SampleClient {
	public static void main(String[] args) {
		// ST<> st = new

		String input = "searchexample";
		Object[] array = Arrays
				.stream(input.split(""))
				.map(e -> e.toUpperCase())
				.toArray();

		for (int i = 0; i < array.length; i++) {
			// st.put(i, array[i]);
		}

		// for( String s: st.keys()) {
		// 	System.out.println(s + " " s.get(s));
		// }

	}
}
