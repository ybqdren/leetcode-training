package com.github.ybqdren;

import com.github.ybqdren.linkedlist.ListNode;

import java.util.HashSet;

/**
 * created by ybqdren
 */
public class lc141 {


    public boolean hasCycle2(ListNode head){
        if(head == null || head.next == null){
            return false;
        }

        HashSet<Object> set = new HashSet<>();
        ListNode curNode = head;
        while (curNode != null){
            if(set.contains(curNode)){
                return true;
            }

            set.add(curNode);
            curNode = curNode.next;
        }

        return false;
    }


    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
