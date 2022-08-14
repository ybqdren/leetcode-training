package com.github.ybqdren.lc;

/**
 * created by ybqdren
 */
public class lc744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0,high = letters.length-1;
        int ans = low;
        while(low <= high){
            int mid = (high - low) /2 + low;
            if(letters[mid] > target){
                ans = mid;
                high = mid - 1;;
            }else{
                low = mid + 1;
            }
        }


        return letters[ans];
    }
}
