package com.cisco.java.chapter5.test;

import com.cisco.java.chapter5.stringUtil;

public class stringUtilTest {
    public static void main(String[] args){
        System.out.println("File name: "+ stringUtil.getFileName("home/Desktop/testFile.txt"));
        System.out.println("File extension: "+stringUtil.getFileExtension("home/Desktop/testFile.txt"));
    }
}
