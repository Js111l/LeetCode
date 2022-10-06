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
    List<Integer> list1=new ArrayList<>();
    List<Integer> list2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1);
        helper2(root2);
        return list1.equals(list2);
    }

    private void helper2(TreeNode root) {
        TreeNode node = root;
        if (node.right == null && node.left == null) {
            list2.add(node.val);
        }
        if(root.left!=null){
            helper2(root.left);
        }
        if(root.right!=null){
            helper2(root.right);
        }
    }

    private void helper(TreeNode root) {
        TreeNode node = root;
        if (node.right == null && node.left == null) {
            list1.add(node.val);
        }
        if(root.left!=null){
            helper(root.left);
        }
        if(root.right!=null){
            helper(root.right);
        }
    }
}
