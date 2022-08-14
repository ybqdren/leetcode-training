package com.github.ybqdren.lc;

/**
 * created by ybqdren
 */
public class lc367 {
    public boolean isPerfectSquare(int num) {
        // 完全平方数：指用一个整数乘以自己例如1*1，2*2，3*3等
        // 若一个数能表示成某个整数的平方的形式，则称这个数为完全平方数
        // log(num) = ?  (log以2为底) -> num = ?^2

        // 14 -> left = 0,right = 7
        // -> 0<7 -> mid = 6+0 = 6 -> count = 36 -> 36 > 14
        // -> 0<5 -> mid = 5 -> count = 25 -> 25 > 14
        // -> 0<4 -> mid = 4 -> count = 16 -> 16 >14
        // -> 0<3 -> mid = 3 -> 9 -> 9 < 14
        // -> 1<3 -> mid = 3 -> 9 -> 9 < 14;
        // -> 2<3 -> mid = 3 -> 9 -> 9<14;
        // -> 3 = 3 -> mid = 3 -> 9<14;
        // -> 4> 3


        // 1 -> left = 0,right = 1
        // -> 0 < 1 -> mid = 1,count = 1 -> 1 == 1
        int left = 0,right = num;
        while(left <= right){
            int mid = (right - left) /2 + left;
            long count = (long)mid * mid;
            if(count == num){
                return true;
            }else if(count > num){
                right = mid-1;
            }else if(count < num){
                left = mid + 1;
            }
        }

        return false;
    }
}
