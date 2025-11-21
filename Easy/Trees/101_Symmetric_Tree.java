/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    boolean check = true;
    public boolean isSymmetric(TreeNode root) 
    {
        //The basic idea is, for each node, go to the left and right child, traverse each of them in order, and check if they are the same
        TreeNode leftcurrent = root.left;
        TreeNode rightcurrent = root.right;
        inorder_trav_check(leftcurrent, rightcurrent);
        return check;
    }
    void inorder_trav_check(TreeNode current1, TreeNode current2)
    {
        if (current1 != null && current2 != null)
        {
            inorder_trav_check(current1.left, current2.right);
            if(current1.val != current2.val) check = false;
            inorder_trav_check(current1.right, current2.left);
        }
        else if (current1!= null && current2 == null) check = false;
        else if (current1== null && current2 != null) check = false;

        
            
    }
}