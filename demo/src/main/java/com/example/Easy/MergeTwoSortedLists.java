package com.example.Easy;

import org.w3c.dom.Node;

public class MergeTwoSortedLists {
 
   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Node temp = this.head;
        int i = 0;
        while(temp!=null)
        {
            temp=temp.next;
            i++;
        }

       ListNode result;
       int j;
       for(j=0; j<)

       return result;
    }
}


//loop through each list
//compare the value
//if the value is higher than the other put it in the new one


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

