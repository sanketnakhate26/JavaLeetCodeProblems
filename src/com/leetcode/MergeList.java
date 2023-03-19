package com.leetcode;
//ListNode class defination
class ListNode
{
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val)
    {
        this.val=val;
    }
    ListNode(int val, ListNode next)
    {
        this.val=val;
        this.next = next;
    }
}
public class MergeList {

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);

        MergeList m = new MergeList();
        ListNode output = m.mergeTwoList(l1,l2);
        System.out.println("MergeList");
        while(output != null)
        {
            System.out.println(output.val);
            output= output.next;
        }
    }


    public ListNode mergeTwoList(ListNode l1, ListNode l2)
    {
        ListNode head = new ListNode();
        ListNode tail = head;

        while(l1 != null || l2 != null)
        {
            if(l1 == null || (l2!=null && l2.val < l1.val))
            {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }else if(l2 == null || (l1!=null && l1.val < l2.val)){
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
        }
        return head.next;
    }
}
