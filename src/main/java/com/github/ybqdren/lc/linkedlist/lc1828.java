package com.github.ybqdren.lc.linkedlist;

import java.util.Arrays;

/**
 * @author ybqdren
 * @date 1/24/2023
 */
public class lc1828 {
    /**
     */
    public int[] countPoints(int[][] points, int[][] queries) {

        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) return a[0] < b[0] ? -1 : 1;
            return a[1] < b[1] ? -1 : 1;
        });

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];
            int r = queries[i][2];

            int s = Math.max(0, upperBound(points, x - r));
            int e = Math.min(lowerBound(points, x + r), points.length - 1);

            for (int j = s; j <= e; j++) {
                int[] p = points[j];
                if ((p[0] - x) * (p[0] - x) + (p[1] - y) * (p[1] - y) <= r * r) {
                    ans[i]++;
                }
            }
        }
        return ans;

    }

    int upperBound(int[][] points, int v) {
        int l = 0, r = points.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (points[m][0] >= v) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    int lowerBound(int[][] points, int v) {
        int l = 0, r = points.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (points[m][0] <= v) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }
}
