package com.srijan.Recurssion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(print(98613 , 0));

    }
    static int print(int n, int sum ){
        if(n<=0){
            return sum;
        }

        int reminder = n %10;
        sum = sum + reminder;
        n = n/10;


        return print (n, sum);
    }
}
