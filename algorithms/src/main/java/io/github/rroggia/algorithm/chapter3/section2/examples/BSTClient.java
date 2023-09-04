package io.github.rroggia.algorithm.chapter3.section2.examples;

public class BSTClient {
    public static void main(String[] args) {
        BST<String, String> bst = new BST<>();

        for (String s : "searchexample".split("")) {
            bst.put(s, s);
        }

        System.out.println(bst.get("r"));
        System.out.println(bst.get("t"));

    }
}
