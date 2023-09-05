package io.github.rroggia.algorithm.chapter3.section2.examples;

public class OrderedBSTClient {
    public static void main(String[] args) {
        OrderedBST<String, String> obst = new OrderedBST<>();

        for (String s : "searchexample".split("")) {
            obst.put(s, s);
        }

        System.out.println(obst.floor("g"));
        System.out.println(obst.ceiling("n"));
        System.out.println((obst.select(9)));

    }
}
