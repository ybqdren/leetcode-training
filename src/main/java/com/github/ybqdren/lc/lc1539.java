package com.github.ybqdren.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 检查前面一个是否相差1，判断第一个是否为1
 *
 * created by ybqdren
 */
public class lc1539 {

    public int findKthPositive(int[] arr, int k) {

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                if(arr[i] != 1){
                    int diff = arr[i] ;
                    int count = 1;
                    while (count < diff){
                        ans.add(arr[i] - (diff - count));
                        count++ ;
                    }
                }
                continue;
            }

            if((arr[i] - arr[i -1]) > 1){
                int diff = arr[i] - arr[i - 1];
                int count = 1;
                while (count < diff){
                    ans.add(arr[i] - (diff - count));
                    count++ ;
                }
            }
        }


        if(ans.size() < k){
            int diffCount = k - ans.size();
            int sizeDiff = 1;
            while (sizeDiff <= diffCount){
                if(ans.size() > 0){
                    ans.add(ans.get(ans.size() - 1) + 1);

                }else{
                    ans.add(arr[arr.length - 1] + 1);
                }
                sizeDiff++;
            }
        }

        return ans.get(k - 1);
    }
}
