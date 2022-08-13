package com.github.ybqdren;

/**
 * created by ybqdren
 */
public class lc69 {
    public int mySqrt(int x) {
        int left = 0 , right = x;
        int ans = -1;
        while (left <= right){
            int mid = (right - left) /2 + left;
            if((long)mid * mid > x){
                right = mid -1;
            }else{
                ans =  mid;
                left = mid +1;
            }
        }

        return ans;
    }
}
