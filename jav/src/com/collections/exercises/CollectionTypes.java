package com.collections.exercises;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionTypes {
    public static void main(String[] args) {
        // insert code here
        Queue<Integer> x =new LinkedList<>();  // ArrayList cannot be used for .poll function

        x.add(1);
        x.add(2);
        x.add(1);
        System.out.println(x.poll());

    }
}
