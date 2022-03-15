package com.niuke.DailyContact;

/**
 * @ClassName OneDay
 * @Description TODO
 * @Author lixinwei
 * @Date 2021/11/10 10:48 下午
 * @Version 1.0
 **/
public class OneDay {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }
    public static ListNode ReverseList(ListNode head) {
        //给定一个单链表的头结点pHead，长度为n，反转该链表后，返回新链表的表头。
        //数据范围： n≤1000
        //要求：空间复杂度 O(1) ，时间复杂度 O(n) 。
        //如当输入链表{1,2,3}时，
        //经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。

        //新链表
        ListNode newHead = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }

        return newHead;
    }
    public static void main(String[] args) {
        ListNode pHead = new ListNode(1);
        ListNode next = new ListNode(2);
        ListNode next2 = new ListNode(3);
        pHead.next = next;
        pHead.next.next = next2;
        System.out.println(ReverseList(pHead).val);
    }
}
