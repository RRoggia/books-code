package io.github.rroggia.algorithm.chapter3.section1.exercises;

import io.github.rroggia.algorithm.chapter3.section1.examples.ST;

import java.util.ArrayList;

public class Exercise02<Key extends Comparable<Key>, Value> implements ST<Key, Value> {
    private Key[] keys;
    private Value[] values;
    private int size = 0;

    public Exercise02() {
        keys = (Key[]) new Comparable[10];
        values = (Value[]) new Comparable[10];
    }

    @Override
    public void put(Key key, Value value) {
        if (size == keys.length) {
            resize(size * 2);
        }
        int insertAt = size;
        for (int i = 0; i < size; i++) {
            if (keys[i].compareTo(key) == 0) {
                insertAt = i;
                break;
            }
        }

        keys[insertAt] = key;
        values[insertAt] = value;

        if (insertAt == size) {
            size++;
        }
    }

    private void resize(int arraySize) {
        Key[] keysTemp = (Key[]) new Comparable[arraySize];
        Value[] valuesTemp = (Value[]) new Comparable[arraySize];
        for (int i = 0; i < size; i++) {
            keysTemp[i] = keys[i];
            valuesTemp[i] = values[i];
        }

        keys = keysTemp;
        values = valuesTemp;
    }

    @Override
    public Value get(Key key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].compareTo(key) == 0) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public void delete(Key key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].compareTo(key) == 0) {
                keys[i] = keys[size - 1];
                values[i] = values[size - 1];
                keys[size - 1] = null;
                values[size - 1] = null;
                size--;
                break;
            }
        }
    }

    @Override
    public boolean contains(Key key) {
        return get(key) != null;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterable<Key> keys() {
        ArrayList<Key> onlyKeys = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            onlyKeys.add(keys[i]);
        }
        return onlyKeys;
    }
}
