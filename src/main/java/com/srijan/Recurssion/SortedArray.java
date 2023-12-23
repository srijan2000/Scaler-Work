package com.srijan.Recurssion;

public class SortedArray {

    public static void main(String[] args){
        int arr[] = {1, 3, 2, 4, 5, 6, 7, 8};
        System.out.println(sort(arr, 0));

    }
    static boolean sort(int arr[], int i) {

        if(i == arr.length -1){
            return true;
        }

        return arr[i] < arr[i+1] && sort(arr, i+1) ;

    }
}
