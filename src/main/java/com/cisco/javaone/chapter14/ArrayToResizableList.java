package com.cisco.javaone.chapter14;

import java.util.ArrayList;
import java.util.List;

/*
Write a method to convert an array of Strings to a resizable List.
 */

public class ArrayToResizableList {
    public static List arrayToList(String[] array){
        List list = new ArrayList();
        for(String s:array){
            list.add(s);
        }
        return list;
    }

    public static void main(String[] args){
        String[] months = {"January","February","March","April"};
        List listConverted = ArrayToResizableList.arrayToList(months);
        //Element added to show resizable nature
        listConverted.add("May");
        System.out.println("Contents of the List");
        for(Object monthName:listConverted){
            System.out.println(monthName);
        }
    }
}
