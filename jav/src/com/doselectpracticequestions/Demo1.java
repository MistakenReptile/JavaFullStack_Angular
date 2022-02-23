package com.doselectpracticequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ArrayListOps{
    public ArrayList<Integer> makeArrayListInt(int n){
        ArrayList<Integer> myArrayInt = new ArrayList<>();
        for(int i=0;i<n;i++){
            myArrayInt.add(0);
        }
        return myArrayInt;
    }

    public ArrayList<Integer> reverseList(ArrayList<Integer> list){
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revArrayList.add(list.get(i));
        }
        return revArrayList;
    }

    public ArrayList<Integer> changeList(ArrayList<Integer>list, int m, int n){
        ArrayList<Integer>  changedArray = new ArrayList (list);
        Collections.replaceAll(changedArray,m,n);
        return changedArray;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListOps object = new ArrayListOps();

        int n_size = sc.nextInt();
        System.out.println(object.makeArrayListInt(n_size));

        ArrayList<Integer> mainList = new ArrayList<>(Arrays.asList(10,25,33,28,10,12));
        System.out.println(object.reverseList(mainList));

        System.out.println(object.changeList(object.reverseList(mainList),28,20));
    }
}
