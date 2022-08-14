package com.github.ybqdren.lc;

/**
 * created by ybqdren
 */
public class lc374 {
    public int guessNumber(int n) {
        int left = 1 , right = n;
        while(left <= right){
            int mid = (right - left) /2 + left;
            int guessResult = guess(mid);
            if(guessResult == -1){
                right = mid -1;
            }else if(guessResult == 1){
                left = mid + 1;
            }else if(guessResult == 0){
                return mid;
            }
        }

        return 0;
    }

    // mooc interface
    int guess(int num){
        return 0;
    }
}
