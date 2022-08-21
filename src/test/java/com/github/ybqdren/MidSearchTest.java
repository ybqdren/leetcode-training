package com.github.ybqdren;

import com.github.ybqdren.lc.lc1539;
import com.github.ybqdren.lc.lc704;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * created by ybqdren
 */
public class MidSearchTest {
    @Test
    public void testlc1539(){
        lc1539 lc1539 = new lc1539();
       /* int kthPositive = lc1539.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5);
        assertEquals(9 , kthPositive);*/

//        int kthPositive2 = lc1539.findKthPositive(new int[]{1, 2, 3, 4}, 2);

        int kthPositive3 = lc1539.findKthPositive(new int[]{3, 10}, 2);
    }
    @Test
    public void testLc704(){
        lc704 lc704 = new lc704();
        int search = lc704.search(new int[]{5}, 5);
        assertTrue(search == 0);
    }
}
