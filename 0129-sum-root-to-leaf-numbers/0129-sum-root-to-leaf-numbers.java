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
    List<String> set = new LinkedList<>();

    public int sumNumbers(TreeNode root) {
        helper(root, new StringBuilder());
        set.forEach(x -> System.out.println(x));
        return set.stream().map(x -> Integer.valueOf(x)).reduce(0, (x, y) -> x + y);
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
          set.add(new StringBuilder(value).toString());
            return;
        }
    }
}