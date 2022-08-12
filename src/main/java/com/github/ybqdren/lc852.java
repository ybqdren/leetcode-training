package com.github.ybqdren;

/**
 * created by ybqdren
 */
public class lc852 {
    // ans = 最小满足 arri > arri+1 的下表i
    public int peakIndexInMountainArray2(int[] arr) {
        int ans = -1;
        int left = 0,right = arr.length -2;
        while (left <= right){
            int mid = (right - left)/2 + left;
            if(arr[mid] > arr[mid + 1]){
                ans = mid;
                right = mid - 1;
            }else {
                left = mid +1;
            }
        }

        return ans;
    }

    // O(n)
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=1;i<arr.length-1 ; i++){
            if(arr[i] >arr[i-1] && arr[i] > arr[i+1] ){
                return i;
            }
        }

        return -1;
    }
}
