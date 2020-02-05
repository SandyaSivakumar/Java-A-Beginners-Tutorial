package com.cisco.java.chapter5.test;

import com.cisco.java.chapter5.StringUtil;

public class StringUtilTest {
    public static void main(String[] args){
        System.out.println("File name: "+ StringUtil.getFileName("home/Desktop/testFile.txt"));
        System.out.println("File extension: "+StringUtil.getFileExtension("home/Desktop/testFile.txt"));
    }
}
