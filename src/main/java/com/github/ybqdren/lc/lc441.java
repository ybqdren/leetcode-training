package com.github.ybqdren.lc;

/**
 * created by ybqdren
 */
public class lc441 {
    public int arrangeCoins(int n) {

        long left = 1 , right = n;
        while (left <= right){
            long mid = left + (right - left) / 2;
            // k(k+1)/2
            long total = mid * (mid + 1) / 2;
            if (total==n) {
                return (int) mid;
            }

            if(total > n){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return (int) right;
    }
}
