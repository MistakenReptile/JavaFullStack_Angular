package com.collections.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class KeyReturn{
    void getKeys(){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"abra");
        map.put(3,"kababra");
        map.put(2,"alakhazam");

        for (Integer key: map.keySet()){
            System.out.println(key);
        }
    }
}

class DateToString{
    void getDate(){
        Date date= Calendar.getInstance().getTime();
        DateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy  hh:mm:ss-z");
        //play with the patterns as multiple 'z'&'M' gives diff output
        String strDate=dateFormat.format(date);
        System.out.println(strDate);
    }
}
public class MapManager {
    public static void main(String[] args) {
        KeyReturn keyReturn=new KeyReturn();
        keyReturn.getKeys();   // returns in sorted order since we used hashmap

        DateToString dateToString=new DateToString();
        dateToString.getDate();

    }
}
