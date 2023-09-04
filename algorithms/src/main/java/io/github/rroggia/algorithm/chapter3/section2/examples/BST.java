package io.github.rroggia.algorithm.chapter3.section2.examples;

import io.github.rroggia.algorithm.chapter3.section1.examples.ST;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BST<Key extends Comparable<Key>, Value> implements ST<Key, Value> {
    private Node root;

    @Override
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node current, Key key, Value value) {
        if (current == null) {
            return new Node(key, value);
        }

        int compare = key.compareTo(current.getKey());
        if (compare > 0) {
            current.setRight(put(current.right, key, value));
        } else if (compare < 0) {
            current.setLeft(put(current.left, key, value));
        } else {
            current.setValue(value);
        }
        current.setLength(size(current.left) + size(current.right) + 1);
        return current;
    }

    @Override
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node current, Key key) {
        if (current == null) {
            return null;
        }
        int compare = key.compareTo(current.getKey());

        if (compare > 0) {
            return get(current.right, key);
        } else if (compare < 0) {
            return get(current.left, key);
        } else {
            return current.getValue();
        }
    }

    @Override
    public void delete(Key key) {

    }

    @Override
    public boolean contains(Key key) {
        return get(key) != null;
    }

    @Override
    public boolean isEmpty() {
        return size() > 0;
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node current) {
        if (current == null) {
            return 0;
        } else {
            return current.length;
        }
    }

    @Override
    public Iterable<Key> keys() {
        return null;
    }
    private class Node {
        public Key key;
        public Value value;
        public Node left;
        public Node right;
        public int length = 1;

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Key getKey() {
            return key;
        }

        public void setKey(Key key) {
            this.key = key;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
