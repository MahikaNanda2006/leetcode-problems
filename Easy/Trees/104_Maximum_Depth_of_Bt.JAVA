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
    int maxLen = 0;
    void inorder(TreeNode current, int steps)
    {
        if (current != null)
        {
            steps++;
            if (maxLen<steps)
            {
                maxLen = steps;
                //steps--;
            }
            inorder(current.left, steps);
            inorder(current.right, steps);
        }
    }
    public int maxDepth(TreeNode root) 
    {
        inorder (root, 0);
        return maxLen;
    }
}
        