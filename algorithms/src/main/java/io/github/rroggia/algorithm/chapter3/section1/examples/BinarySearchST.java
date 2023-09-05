package io.github.rroggia.algorithm.chapter3.section1.examples;

import io.github.rroggia.algorithm.chapter1.section3.examples.Queue;

import java.util.ArrayList;

public class BinarySearchST<Key extends Comparable<Key>, Value> implements OrderedST<Key, Value> {
    public Key[] keys;
    public Value[] values;

    private int size;

    BinarySearchST() {
        this.keys = (Key[]) new Comparable[10];
        this.values = (Value[]) new Comparable[10];
    }

    @Override
    public Key min() {
        return keys[0];
    }

    @Override
    public Key max() {
        return keys[size - 1];
    }

    @Override
    public Key floor(Key key) {
        return null;
    }

    @Override
    public Key ceiling(Key key) {
        return keys[rank(key)];
    }

    @Override
    public int rank(Key key) {
        int lower = 0;
        int higher = size - 1;

        while (lower <= higher) {
            int mid = lower + (higher - lower) / 2;
            int compareResult = key.compareTo(keys[mid]);
            if (compareResult < 0) {
                higher = mid - 1;
            } else if (compareResult > 0) {
                lower = mid + 1;
            } else {
                return mid;
            }
        }
        return lower;

    }

    @Override
    public Key select(int k) {
        return keys[k];
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
        Queue<Key> queue = new Queue<>();
        int rankingLower = rank(lower);
        int rankingHigher = rank(higher);
        for (int i = rankingLower; i < rankingHigher; i++) {
            queue.enqueue(keys[i]);
        }

        if (contains(higher)) {
            queue.enqueue(keys[rankingHigher]);
        }
        return queue;
    }

    @Override
    public void put(Key key, Value value) {

        if (size == keys.length) {
            this.resize(size * 2);
        }


        int i = rank(key);
        // key already exists in array, only needs to update it.
        if (i < size && keys[i].compareTo(key) == 0) {
            values[i] = value;
            return;
        }

        // shift all keys and values to the right, to open space to add new key
        for (int j = size; j > i; j--) {
            keys[j] = keys[j - 1];
            values[j] = values[j - 1];
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    private void resize(int arraySize) {
        var keyTemp = (Key[]) new Comparable[arraySize];
        var valueTemp = (Value[]) new Comparable[arraySize];
        for (int i = 0; i < this.size; i++) {
            keyTemp[i] = this.keys[i];
            valueTemp[i] = this.values[i];
        }
        this.keys = keyTemp;
        this.values = valueTemp;
    }

    @Override
    public Value get(Key key) {
        if (isEmpty()) {
            return null;
        }
        int ranking = rank(key);
        if (ranking < size && keys[ranking].compareTo(key) == 0) {
            return values[ranking];
        } else {
            return null;
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
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterable<Key> keys() {
        ArrayList<Key> keys1 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            keys1.add(keys[i]);
        }
        return keys1;

    }
}
