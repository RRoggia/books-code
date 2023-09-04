package io.github.rroggia.algorithm.chapter4.section1.examples;

public class STSymbolGraph implements SymbolGraph {
	private Graph graph;

	public STSymbolGraph(String filename, String delim) {

	}

	@Override
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int index(String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String name(int v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Graph getGraph() {
		return this.graph;
	}

}
