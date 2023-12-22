package com.srijan;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        System.out.println( search(arr, target, 0));


    }
    static int search (int arr[], int target, int i){
        if(i == arr.length-1 && target!= arr[i]){
            return 0;
        }
        if(target != arr[i]){
            return search(arr, target, i+1);
        }
        return i;
    }
}
