package com.sanskriti;

public class Linear_search {
    public static void main(String[] args) {
        int[] nums = {2,3,8,9};
        int target =  9;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    // search in the array : return the index if element is found
    //otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for(int index = 0 ; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        // if none of the statements execute, return -1
        return -1;
    }
}
