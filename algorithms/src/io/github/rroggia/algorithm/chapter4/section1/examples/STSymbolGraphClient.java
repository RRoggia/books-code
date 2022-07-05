package io.github.rroggia.algorithm.chapter4.section1.examples;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class STSymbolGraphClient {
	public static void main(String[] args) {
		String filename = args[0];
		String delim = args[1];
		SymbolGraph st = new STSymbolGraph(filename, delim);
		Graph graph = st.getGraph();

		while (StdIn.hasNextLine()) {
			String source = StdIn.readLine();
			for (int w : graph.adjacent(st.index(source))) {
				StdOut.println(" " + st.name(w));
			}
		}

	}
}
