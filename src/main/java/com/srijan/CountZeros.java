package com.srijan;

public class CountZeros {
    static int count = 0;
    static int count(int n){
        if(n%10 == n) {
            return count;
        }
        if(n% 10 == 0){
            count++;
        }
       return count(n/10);

    }

    public static void main(String[] args) {
        System.out.println(count(30240));
    }
}
