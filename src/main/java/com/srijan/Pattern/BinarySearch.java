package com.srijan.Pattern;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 8, 9, 10};
        int target = 8;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int arr[], int target){
        int s = 0;
        int e = arr.length -1;

        while(s<e){
            int m = s + (e-s)/2;
            if(target == arr[m]){
                return m;
            }
            if(target <= arr[m]){
                e = m -1;
            }
            else if (target >= arr[m]){
                s = m+1;
            }
        }
        return -1;
    }
}
