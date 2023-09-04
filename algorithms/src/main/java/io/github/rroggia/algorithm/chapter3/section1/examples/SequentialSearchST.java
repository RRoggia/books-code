package io.github.rroggia.algorithm.chapter3.section1.examples;

import java.util.ArrayList;
import java.util.List;

public class SequentialSearchST<Key, Value> implements ST<Key, Value> {
    private Node first;
    private int size;

    @Override
    public void put(Key key, Value value) {
        Node current = first;
        for (; current != null; current = current.getNext()) {
            if (key.equals(current.getKey())) {
                break;
            }
        }
        if (current == null) {
            this.size++;
            this.first = new Node(key, value, first);
        } else {
            current.setValue(value);
        }
    }

    @Override
    public Value get(Key key) {
        for (Node current = first; current != null; current = current.getNext()) {
            if (key.equals(current.getKey())) {
                return current.getValue();
            }
        }
        return null;
    }

    @Override
    public void delete(Key key) {
        Node current = first;
        for (; current != null; current = current.getNext()) {
            if (key.equals(current.getKey())) {
                break;
            }
        }
        if (current != null) {
            this.size--;
            current.setValue(null);
        }
    }

    @Override
    public boolean contains(Key key) {
        return get(key) != null;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterable<Key> keys() {
        List<Key> keys = new ArrayList<>();
        for (Node curr = first; curr != null; curr = curr.getNext()) {
            keys.add(curr.getKey());
        }
        return keys;
    }

    private class Node {
        private Key key;
        private Value value;

        private Node next;

        Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
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
    }
}
