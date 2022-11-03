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
    List<String> list = new LinkedList<>();
    List<Character> alphabet = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        helper(root, new StringBuilder());
        Collections.sort(list);
        return list.get(0);
    }

    private void helper(TreeNode root, StringBuilder value) {
        value.append(alphabet.get(root.val));
        if (root.left != null) {
            helper(root.left, new StringBuilder(value));
        }
        if (root.right != null) {
            helper(root.right, new StringBuilder(value));
        }
        if (root.left == null && root.right == null) {
            list.add(new StringBuilder(value).reverse().toString());
        }
    }
}
