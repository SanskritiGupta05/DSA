package com.sanskriti;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        // run the steps n-1 times
        for(int i=0; i<arr.length; i++){
            // for each step, max item will come at the last respective Index
            boolean swapped = false;
            for(int j = 1; j<arr.length - i; j++){
                //swap
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

