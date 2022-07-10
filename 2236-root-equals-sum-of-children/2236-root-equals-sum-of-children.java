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
    public boolean checkTree(TreeNode root) {
        int sum=0;
        if(root!=null){
            sum+=root.right.val;
            sum+=root.left.val;
        }
        if(root.val==sum){
            return true;
        }
        else 
            return false;

    }
}



