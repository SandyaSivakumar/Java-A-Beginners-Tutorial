package com.cisco.javatwo.chapter7;

import java.util.Scanner;

class Fibonacci {
    static int fib(int n)
    {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 1];
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;

        if (n > 0) {
            f[1] = 1;

            for (i = 2; i <= n; i++) {
                /* Add the previous 2 numbers in the series
             and store it */
                f[i] = f[i - 1] + f[i - 2];
            }
        }

        return f[n];
    }

    public static void main(String args[])
    {
        int n;
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(n+"th Fibonacci number: "+fib(n));
    }
}
