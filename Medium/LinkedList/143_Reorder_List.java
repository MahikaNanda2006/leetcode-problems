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
class Solution 
{
    public void reorderList(ListNode head) 
    {
        //Finding midpoint
        ListNode slow = head;
        ListNode fast = head;
    while (fast != null && fast.next != null && fast.next.next != null)

        {
            fast = fast.next.next;
            slow = slow.next;
        }
        //Now slow is at the midpoint
        //Reversing the second node
        ListNode prev = null;
        ListNode current = slow.next;
        while (current != null) 
        {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        slow.next = null;

        //Now combine the two ListNodes
        ListNode first = head;
        ListNode second = prev; // head of reversed half

        while (second != null) 
        {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

        //Now return head
    }
}