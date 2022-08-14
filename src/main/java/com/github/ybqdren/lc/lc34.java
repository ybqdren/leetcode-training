package com.github.ybqdren.lc;

/**
 * created by ybqdren
 */
public class lc34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        int left = binarySearch(nums , target , true);
        int right = binarySearch(nums ,target , false);
        if(left ==-1 || right == -1){
            return ans;
        }

        ans[0] = left;
        ans[1] = right;
        return ans;
    }


    public int binarySearch(int[] nums , int target , boolean isLow){
        int left = 0 , right = nums.length-1;
        int index = -1;
        while(left <= right){
            int mid = (right - left)/2 + left;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                if(isLow){
                    return mid;
                }else{
                    index = mid;
                }
                left = mid + 1;
            }
        }
        return index;
    }
}
