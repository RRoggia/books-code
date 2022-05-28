package io.github.rroggia.algorithm.chapter2.section1.examples;

public class SelectionClient {
	public static void main(String[] args) {
		var array = "imagineumtextomuitograndeemaiiordoquevocepoderiaescreverparatestarmosquyantoscountsseraoexcecuytadfisoaacadaalgoritmo"
				.split("");
		System.out.println("N: " + array.length);
		System.out.println("N²: " + array.length * array.length);
		System.out.println("N²/2: " + array.length * array.length / 2);
		Selection.sort(array);
		System.out.println("Is sorted? " + Example.isSorted(array));
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}
}
