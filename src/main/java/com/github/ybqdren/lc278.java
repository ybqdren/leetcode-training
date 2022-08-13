package com.github.ybqdren;

/**
 * created by ybqdren
 */
public class lc278 {
    public int firstBadVersion(int n) {
        int oldV = 0, newV = n;
        int ans = n;
        while(oldV <= newV){
            int mid = (newV - oldV)/2 + oldV;
            if(isBadVersion(mid)){
                ans = mid;
                newV = mid - 1;
            }else{
                oldV = mid + 1;
            }
        }

        return ans;
    }

    // 方法占位
    public boolean isBadVersion(int num){
        return false;
    }
}
