package com.srijan;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 number : 1 2 3 4 5

        print(1);

    }//you can convert recursion solution into iteration and vice versa
    //space complexity is not constant because of recursive calls

    static void print(int n){
        //Base condition in Recursion : Condition where our recursion will stop making new calls
        if(n == 6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}
