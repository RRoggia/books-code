package io.github.rroggia.algorithm.chapter3.section2.examples;

import io.github.rroggia.algorithm.chapter3.section1.examples.OrderedST;

public class OrderedBST<Key extends Comparable<Key>, Value> implements OrderedST<Key, Value> {

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
        if (key == null) {
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
    public Key min() {
        return min(root).getKey();
    }

    private Node min(Node current) {
        if (current.left == null) {
            return current;
        }
        return min(current.left);
    }


    @Override
    public Key max() {
        return max(root).getKey();
    }

    private Node max(Node current) {
        if (current.right == null) {
            return current;
        }
        return max(current.right);
    }

    @Override
    public Key floor(Key key) {
        Node floor = floor(root, key);
        if (floor == null) {
            return null;
        }
        return floor.key;
    }

    public Node floor(Node current, Key key) {
        if (current == null) {
            return null;
        }

        int compare = key.compareTo(current.key);
        if (compare == 0) {
            return current;
        } else if (compare < 0) {
            return floor(current.left, key);
        }

        Node t = floor(current.right, key);
        if (t != null) {
            return t;
        } else {
            return current;
        }
    }

    @Override
    public Key ceiling(Key key) {
        Node ceiling = ceiling(root, key);
        if (ceiling == null) {
            return null;
        }
        return ceiling.key;
    }

    public Node ceiling(Node current, Key key) {
        if (current == null) {
            return null;
        }

        int compare = key.compareTo(current.key);
        if (compare == 0) {
            return current;
        } else if (compare > 0) {
            return ceiling(current.right, key);
        }

        Node t = ceiling(current.left, key);
        if (t != null) {
            return t;
        } else {
            return current;
        }
    }

    @Override
    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(Node current, Key key) {
        if (current == null) {
            return 0;
        }
        int compare = key.compareTo(current.key);
        if (compare > 0) {
            return size(current.left) + 1 + rank(current.right, key);
        } else if (compare < 0) {
            return rank(current.left, key);
        } else {
            return size(current.left);
        }
    }

    @Override
    public Key select(int k) {
        return select(root, k).key;
    }

    //ordered implementation therefore needs to consider this when return the k node
    //    acehlmprsx

    public Node select(Node current, int k) {
        if (current == null) {
            return current;
        }
        int leftSize = size(current.left);
        if (leftSize > k) {
            return select(current.left, k);
        } else if (leftSize < k) {
            return select(current.right, k - leftSize - 1);
        } else {
            return current;
        }


    }

    @Override
    public void deleteMin() {

    }

    @Override
    public void deleteMax() {

    }

    @Override
    public int size(Key lower, Key higher) {
        return 0;
    }


    @Override
    public Iterable<Key> keys(Key lower, Key higher) {
        return null;
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
