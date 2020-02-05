package com.cisco.java.chapter5;

/*
Create a utility/helper class named StringUtil in com.example.util. This class
should have two static methods, getFileName and getFileExtension.
Both methods receive a file path and returns a file name or file extension, respectively.
Create a com.example.test.StringUtilTest class to test the methods
 */

public class StringUtil {
    public static String getFileName(String path){
        String[] list = path.split("/");
        String fullFileName = list[list.length-1];
        return fullFileName.split("\\.")[0];
    }

    public static String getFileExtension(String path){
        String[] list = path.split("/");
        String fullFileName = list[list.length-1];
        return fullFileName.split("\\.")[1];

    }
}
