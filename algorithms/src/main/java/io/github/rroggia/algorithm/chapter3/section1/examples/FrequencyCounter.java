package io.github.rroggia.algorithm.chapter3.section1.examples;

import edu.princeton.cs.algs4.Stopwatch;
import io.github.rroggia.algorithm.chapter3.section1.exercises.Exercise02;
import io.github.rroggia.algorithm.chapter3.section2.examples.BST;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCounter {
    public static void main(String[] args) {

        FrequencyCounter frequencyCounter = new FrequencyCounter();
        InputStream is = frequencyCounter.getClass().getClassLoader().getResourceAsStream("tale.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        List<String> collect = br.lines()
                .flatMap(l -> Stream.of(l.split(" ")))
                .collect(Collectors.toList());

        runFrequencyCounter("Unordered Linked List", collect, new SequentialSearchST<>());
        runFrequencyCounter("Ordered arrays Binary Search", collect, new BinarySearchST<>());
        runFrequencyCounter("Unordered array - Exercise 2", collect, new Exercise02<>());
        runFrequencyCounter("BST - Section2", collect, new BST<>());


    }

    public static void runFrequencyCounter(String title, List<String> collect, ST<String, Integer> st) {
        System.out.println("Starting" + title);
        var watch = new Stopwatch();
        int minLength = 8;
        collect.stream()
                .filter(c -> c.length() >= minLength)
                .forEach(c -> {
                    if (!st.contains(c)) {
                        st.put(c, 1);
                    } else {
                        st.put(c, st.get(c) + 1);
                    }
                });
        String max = "";
        st.put(max,0);
        for(String word: st.keys()){
            if(st.get(word)> st.get(max)){
                max = word;
            }
        }
        System.out.println(max + " " + st.get(max));
        System.out.println(watch.elapsedTime());

    }
}
