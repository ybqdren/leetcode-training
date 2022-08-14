package com.github.ybqdren.lc;

import java.util.Arrays;

/**
 * 纵向扫描
 *
 * created by ybqdren
 */
public class lc14_2 {
    public String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }

        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < count; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0 , i);
                }
            }

        }

        return strs[0];
    }
}
