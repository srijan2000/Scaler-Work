package com.srijan;

import java.util.ArrayList;

public class LinearSearchOnMultiOccasion {
    /*public static void main(String[] args) {
        int arr[] = {1, 3, 4, 4, 7, 8};
        int target = 4;
        findAllIndex(arr, target, 0);
        System.out.println(list);
    }
   static ArrayList<Integer> list = new ArrayList<>();
   static void findAllIndex(int arr[], int target, int i) {
       if (i == arr.length) {
           return;
       }
       if (arr[i] == target) {
           list.add(i);
       }

       findAllIndex(arr, target, i + 1);

   }*/
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 6, 7, 6, 9};
        int target = 6;

        searAllIndex(arr, target, 0);
        System.out.println(list);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searAllIndex(int arr[], int target, int i){
        if(i == arr.length){
            return;
        }
        if(target == arr[i]){
            list.add(i);
        }
        searAllIndex(arr, target, i+1);
    }

}
