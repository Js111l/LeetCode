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
    public int maxDepth(TreeNode root) {
        int sum = 0;
        sum = metoda(root);
        return sum;
    }

    private int metoda(TreeNode root) {
        if (root == null) {
            return 0;
        }
    
       int l=1+ metoda(root.right);
       int r=1+ metoda(root.left);
        return Math.max(r,l);

    }
}