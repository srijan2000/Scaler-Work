package com.srijan;

import java.util.ArrayList;

public class returnList {
    //return the list
    // don't take it in argument
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5, 4};
        int target = 4;
        System.out.println(search(arr, target,0));

    }
    static ArrayList<Integer> search(int arr[], int target, int i){
        ArrayList<Integer> l = new ArrayList<>();
        if(i == arr.length){
            return l;
        }
        //this will contain answer for that function call only
        if(arr[i] == target){
            l.add(i);
        }

        ArrayList<Integer > ansFromBelowCalls = search(arr, target, i+1);
        l.addAll(ansFromBelowCalls);
        return  l;
    }
}
