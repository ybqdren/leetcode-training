package com.github.ybqdren;

/**
 * created by ybqdren
 */
public class lc704 {
    public int search(int[] nums, int target) {

        if(nums.length == 0){
            return -1;
        }

        int left  = 0,right = nums.length - 1;
        while (left <= right){
            int mid = (right - left) /2 + left;
            if(target > nums[mid]){
                left = mid +1;
            }else if(target < nums[mid]){
                right = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
