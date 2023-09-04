package io.github.rroggia.algorithm.chapter1.section2.exercises;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise1 {
	public static void main(String[] args) {
		int iterations = Integer.parseInt(args[0]);

		Point2D[] points = new Point2D[iterations];

		StdDraw.setCanvasSize(1024, 512);
		StdDraw.setPenRadius(.015);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);

		for (int i = 0; i < iterations; i++) {
			var point = new Point2D(StdRandom.uniform(), StdRandom.uniform());
			StdDraw.point(point.x(), point.y());
			points[i] = point;
		}

		double shortestPath = Double.MAX_VALUE;
		Point2D p1 = null;
		Point2D p2 = null;
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length - 1; j++) {
				double distance = points[i].distanceTo(points[j]);
				if (shortestPath > distance) {
					shortestPath = distance;
					p1 = points[i];
					p2 = points[j];
				}
			}
		}
		StdOut.print("Shortest path is " + shortestPath + " from " + p1 + "to" + p2);
	}
}
