class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addRecursive(l1, l2, 0);
    }
    private ListNode addRecursive(ListNode l1, ListNode l2, int carry)
    {
        //base case
        if (l1 == null && l2 == null && carry == 0)
        {
            return null;
        }
        int x = (l1!=null)?l1.val:0;
        int y = (l2!=null)?l2.val:0;
        int sum = x+y+carry;
        int newcarry = sum/10;
        ListNode result = new ListNode(sum%10);
        result.next = addRecursive(
            (l1!=null)? l1.next:null,
            (l2!=null)? l2.next:null,
            newcarry
        );
        return result;
    }
}