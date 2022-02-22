package com.collections.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class RemoveList{
    void removeElements(){
        List<String> list1=new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> list2=new ArrayList<>(Arrays.asList("a","b","e"));
        list1.removeAll(list2);
        System.out.println(list1);
    }
    void getArrayList(){
        String[] words={"abra","kadabra","alakhazam"};
        List<String> list=Arrays.asList(words);

        Collections.sort(list);  // method to sort the elements

        for (String r:list){
            System.out.println(r);   // use this method if u need separate elements of the list
        }

        System.out.println(list);  // use this method for list as the output
    }
}

public class ListManager {
    public static void main(String[] args) {
        RemoveList removeList=new RemoveList();
        removeList.removeElements();

        removeList.getArrayList();

    }
}
