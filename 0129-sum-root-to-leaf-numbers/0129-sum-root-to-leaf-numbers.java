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
    List<String> list= new LinkedList<>();
    public int sumNumbers(TreeNode root) {
        helper(root, new StringBuilder());
        int sum=0;
        for (String str:list
             ) {
            sum+=Integer.valueOf(str);
        }
        return sum;
    }

    private void helper(TreeNode root, StringBuilder value) {
        value.append(root.val);
        if (root.left != null) {
            System.out.println(root.val);
            helper(root.left, new StringBuilder(value));
        }
        if (root.right != null) {
            System.out.println(root.val);
            helper(root.right, new StringBuilder(value));
        }
        if (root.left == null && root.right == null) {
            list.add(new StringBuilder(value).toString());
            return;
        }
    }
}
