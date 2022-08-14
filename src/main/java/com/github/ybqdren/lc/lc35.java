package com.github.ybqdren.lc;

/**
 * 不用去单独考虑=mid的情况
 *
 * created by ybqdren
 */
public class lc35 {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left =0 , right= length -1;
        int result = length;
        while (left <= right){
            int mid = (right-left)/2 + left;
            if(target <= nums[mid]){
                result = mid;
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid +1;
            }
        }

        return result;
    }
}
