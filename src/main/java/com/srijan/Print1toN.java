package com.srijan;

public class Print1toN {
    public static void main(String[] args) {
        printrev(5);

    }
    static void printrev(int n) {
        if (n == 0) {
            return;
        }

        printrev(n - 1);
        System.out.println(n);
    }

}
