package com.github.ybqdren;

import com.github.ybqdren.lc.lc704;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * created by ybqdren
 */
public class MidSearchTest {



    @Test
    public void testLc704(){
        lc704 lc704 = new lc704();
        int search = lc704.search(new int[]{5}, 5);
        assertTrue(search == 0);
    }
}
