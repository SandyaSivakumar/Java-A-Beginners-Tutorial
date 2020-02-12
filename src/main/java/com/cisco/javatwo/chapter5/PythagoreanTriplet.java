package com.cisco.javatwo.chapter5;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper limit:");
        int limit = scanner.nextInt();
        int a, b, c = 0;
        int i = 2;

        while (c < limit) {
            for (int n = 1; n < i; ++n) {
                a = i * i - n * n;
                b = 2 * i * n;
                c = i * i + n * n;

                if (c > limit)
                    break;
                System.out.println(a + " " + b + " " + c);
            }
            i++;
        }
    }
}
