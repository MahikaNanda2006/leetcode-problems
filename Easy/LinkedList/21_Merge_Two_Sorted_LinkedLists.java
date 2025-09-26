package LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode dummy = new ListNode(0);
        //It's not necessary to create dummy.nexts right now, it can be done directly in the next steps
        ListNode check =  dummy; //We want check to be equal to dummy at the start, so that at the end, dummy.next immediately starts with the lists.
        while (list1!= null && list2!= null)
        {
            if (list1.val < list2.val)
            {
                check.next = list1;
                list1 = list1.next;
            }
            else
            {
                check.next = list2;
                list2 = list2.next;
            }
            check = check.next;
        }
         //We need to check for one list getting over now, so we do that here
            if (list1 == null && list2!=null) check.next = list2;
            else if (list2 == null && list1 != null) check.next = list1;
        return dummy.next;
        
    }
}