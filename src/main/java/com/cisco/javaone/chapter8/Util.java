package com.cisco.javaone.chapter8;

/*
Write a utility class called Util that has a static
method named addArray for adding two arrays of the same length. The signature of addArray is as follows.
public static long[] addArray(int[] array1, int[] array2) throws MismatchedArrayException,
java.lang.NullPointerException
The method throws a MismatchedArrayException if the lengths of both arguments are not the same. The toString method of the exception class must return this value:
Mismatched array length. The first array's length is length1. The second array's length is length2
where length1 is the length of the first array and length2 the length of the second array.
The method throws a NullPointerException if one of the arrays is null.
 */

import java.util.Arrays;

public class Util {
    public static long[] addArray(int[] array1, int[] array2) throws MismatchedArrayException, java.lang.NullPointerException{
        if(array1.length==0 || array2.length==0){
            throw new NullPointerException("Empty array exception");
        }
        if(array1.length!=array2.length){
            throw new MismatchedArrayException(array1,array2);
        }
        int i;
        long[] result = new long[array1.length];
        for(i=0;i<array1.length;i++){
            result[i]=(long)(array1[i]+array2[i]);
        }
        return result;

    }
    public static void main(String[] args){
        int[] list1 = {100,1000,10000,Integer.MAX_VALUE};
        int[] list2 = {10,100,1000,Integer.MAX_VALUE};
        int[] list3 = {1,2};
        try{
            long[] result = addArray(list1,list2);
            System.out.println(Arrays.toString(result));
        } catch (NullPointerException e){
            System.out.println(e);
        } catch (MismatchedArrayException e){
            System.out.println(e);
        }

        try{
            long[] result = addArray(list1,list3);
            Arrays.toString(result);
        } catch (NullPointerException e){
            System.out.println(e);
        } catch (MismatchedArrayException e){
            System.out.println(e);
        }
    }

}
