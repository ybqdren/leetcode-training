package com.github.ybqdren;

import com.github.ybqdren.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * created by ybqdren
 */
public class LinkedListTest {


    @Test
    public void testlc24(){
        lc24 lc24 = new lc24();
        ListNode listNode = new ListNode();
        listNode.val = 1;
        ListNode next  = new ListNode();
        next.val = 2;
        listNode.next = next;
        ListNode next1 = new ListNode();
        next1.val = 3;
        next.next = next1;
        ListNode next2 = new ListNode();
        next2.val = 4;
        next1.next = next2;
        ListNode result = lc24.swapPairs(listNode);

        String rs = "";
        while (result != null){
            rs += result.val;
            result = result.next;
        }

        assertEquals(rs , "2143");
    }

    @Test
    public void testlc206(){
        lc206 lc206 = new lc206();
        ListNode listNode = new ListNode();
        listNode.val = 1;
        ListNode next  = new ListNode();
        next.val = 2;
        listNode.next = next;
        ListNode next1 = new ListNode();
        next1.val = 3;
        next.next = next1;
        ListNode result = lc206.reverseList(listNode);

        String rs = "";
        while (result != null){
            rs += result.val;
            result = result.next;
        }

        assertEquals(rs,"321");


        ListNode listNode2 = new ListNode();
        listNode2.val = 1;
        ListNode next22  = new ListNode();
        next22.val = 2;
        listNode2.next = next22;
        ListNode next23 = new ListNode();
        next23.val = 3;
        next22.next = next23;
        ListNode result2 = lc206.reverseList2(listNode2);
        rs = "";
        while (result2 != null){
            rs += result2.val;
            result2 = result2.next;
        }

        assertEquals(rs , "321");
    }
}
