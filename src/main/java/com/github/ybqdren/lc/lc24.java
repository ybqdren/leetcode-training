package com.github.ybqdren.lc;

import com.github.ybqdren.lc.linkedlist.ListNode;

/**
 * created by ybqdren
 *
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
public class lc24 {
        // 1234 -> 2 1 3 4     head = head.next head.next = head.next.next
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }

            ListNode next = head.next;
            head.next = swapPairs(next.next);
            next.next = head;
            return next;
        }
}
