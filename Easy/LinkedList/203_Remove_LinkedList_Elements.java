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
class Solution 
{
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode trav = head;
        while (head != null )
        {
            if (head.val == val)
            {
                head = head.next;
                trav = trav.next;
            }
            else break;  
        } 
        while (trav != null && trav.next!= null)
        {
            
            if( trav.next.val == val)
            {
                trav.next = trav.next.next;
            }
            else trav = trav.next;
        }
        return head;
    }
}
