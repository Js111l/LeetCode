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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
    if(root.right==null&&root.left==null){
            return 0;
        }
        helper(root,root);
        return sum;
    }
    private void helper(TreeNode root,TreeNode prev) {

        
       if(root.left!=null){
           helper(root.left,root);
       }
       if(root.right!=null){
           helper(root.right,root);
       }
       if(root.left==null&&root.right==null&&prev.right!=root){
           sum+=root.val;
       }

    }
}