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
class Solution {
    boolean check = true;
    public boolean isValidBST(TreeNode root) {
        //preorder (root, root.val);
        //To traverse the array
        //First reach the leftenmost child of the array
        //Then put the node
        //Then the rightenmost child
        //Keep this order

        ArrayList<Integer> array = new ArrayList<Integer>();
        TreeNode current = root;
        preorder(current, 0, 0);
        //int len = array.size();
        //for (int i=0; i<len-1; i++)
        //{
        //    if (array.get(i)>=array.get(i+1)) check = false;
        //}
        return check;
    }
    /*void inorder(TreeNode current, ArrayList<Integer> array)
    {
        if (current == null) return;
        inorder(current.left, array);
        array.add(current.val);
        inorder(current.right, array);

    }*/

    void preorder(TreeNode current, int min, int max)
    {
        
        if (current!= null)
        {
            if (current.left!= null)
            {
                //Condition for current.left is
                //It needs to be between min and current
                //Min here will be as given and max will be current.left.val
                //So if it is bigger than current.left or smaller than min then we flag it
                if (min == 0)
                {
                    if (current.left.val>=current.val) check = false;
                }
                else
                {
                    if (current.left.val<=min) check = false;
                    else if (current.left.val>=current.val) check = false;
                }
            }
            if (current.right!= null)
            {
                //Conditions for current.right is
                //It needs to be between current and max
                //So if it is smaller than current or bigger than max then we flag it
                if (max == 0)
                {
                    if (current.right.val<=current.val) check = false;
                }
                else
                {
                    if (current.right.val<=current.val) check = false;
                    else if (current.right.val >= max ) check = false;
                }
               
            }
            int min2 = Integer.MIN_VALUE;
            int max2 = Integer.MAX_VALUE;
            if (min > min2) min2 =  min;
            if (max < max2) max2 = max;
            preorder(current.left, min2, current.val);
            preorder (current.right, current.val, max2);
        }
    }
}