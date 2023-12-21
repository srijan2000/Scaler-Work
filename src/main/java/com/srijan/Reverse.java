package com.srijan;

public class Reverse {
    /*public static void main(String[] args) {
        rev(1234, 0);

    }
    static void rev(int n, int sum){

        if(n == 0){
            System.out.println(sum);
            return ;

        }


        int rem = n %10;
        sum = sum *10 + rem;
        rev(n/10, sum );
    }*/
/*    static int sum = 0;
    static void rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n %10;
        sum = sum *10 + rem;
        rev1(n /10);
    }

    public static void main(String[] args) {
        rev1(1244);
        System.out.println(sum);
    }*/
  static int  rev(int n){
      int digits = (int)(Math.log10(n) +1);
     return helper(n, digits);

  }
   static int helper(int n, int digits){
      if(n % 10 == n){
          return n;
      }
      int rem = n%10;
      return rem * (int)Math.pow(10, digits -1) + helper( n/10 , digits-1);
  }

    public static void main(String[] args) {
        System.out.println(rev(1234));

    }

}
