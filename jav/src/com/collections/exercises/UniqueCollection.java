package com.collections.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class GetUniqueValues{
    void getCollection(){
        String[] strings={"abra","kadabra","abra","alakhazam"};
        Set<String> stringSet=new HashSet<>(Arrays.asList(strings));
        System.out.println(stringSet);
    }
}
public class UniqueCollection {
    public static void main(String[] args) {
        GetUniqueValues obj=new GetUniqueValues();
        obj.getCollection();
    }
}
