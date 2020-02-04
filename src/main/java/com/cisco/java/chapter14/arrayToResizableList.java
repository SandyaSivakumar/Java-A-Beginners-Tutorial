package com.cisco.java.chapter14;

import java.util.ArrayList;
import java.util.List;

public class arrayToResizableList {
    public static List arrayToList(String[] array){
        List list = new ArrayList();
        for(String s:array){
            list.add(s);
        }
        return list;
    }

    public static void main(String[] args){
        String[] months = {"January","February","March","April"};
        List listConverted = arrayToResizableList.arrayToList(months);
        //Element added to show resizable nature
        listConverted.add("May");
        System.out.println("Contents of the List");
        for(Object monthName:listConverted){
            System.out.println(monthName);
        }
    }
}
