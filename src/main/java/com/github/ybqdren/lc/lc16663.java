package com.github.ybqdren.lc;

import java.util.Arrays;

/**
 * @author ybqdren
 * @date 1/26/2023
 */
public class lc16663 {

    public static void main(String[] args) {
        int n = 3;
        int k = 27;
        String smallestString = new lc16663().getSmallestString(n, k);
        System.out.println(smallestString);
    }


    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        Arrays.fill(ans , 'a');
        int i = n - 1 , d = k - n;
        for (;d>25 ; d-=25){
            ans[i--] = 'z';
        }
        ans[i] = (char) ('a' + d);
        return String.valueOf(ans);
    }
}
