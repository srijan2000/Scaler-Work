package com.srijan;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 number : 1 2 3 4 5
        print(1);

    }
    static void print(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}
