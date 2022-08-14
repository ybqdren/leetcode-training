package com.github.ybqdren.lc;

import com.github.ybqdren.lc.linkedlist.ListNode;

/**
 * created by ybqdren
 *
 *
 * 12345 -> 54321
 *
 * 1->2->3->4->5    ==> 5->4->3->2->1
 */
public class lc206 {
    public static void main(String[] args) {
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
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }



    public ListNode reverseList2(ListNode head){

       ListNode pre = null;
       ListNode cur = head;
       while (cur != null){
           ListNode next = cur.next;
           cur.next = pre;
           pre = cur;
           cur = next;
       }

       return pre;
    }

    public ListNode reverseList(ListNode head) {
       if(head ==  null || head.next == null){
           return head;
       }

        ListNode newListNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newListNode;
    }


}
