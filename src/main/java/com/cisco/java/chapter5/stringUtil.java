package com.cisco.java.chapter5;

public class stringUtil {
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
