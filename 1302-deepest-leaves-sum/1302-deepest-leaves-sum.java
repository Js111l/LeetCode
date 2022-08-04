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
    int l=0;
    public int deepestLeavesSum(TreeNode root) {

        int maxDepth=helper(root,1);
       int s=0;
        s=traverse(root,1,0,maxDepth);
        return s;
    }


    private int helper(TreeNode root, int depth) {
        if(root.left==null && root.right==null){
            System.out.println(root.val);
            return depth;

        }
        int l=0;
        if(root.left!=null) {
            l = helper(root.left, depth + 1);
        }
        int r=0;
        if(root.right!=null) {
            r = helper(root.right, depth + 1);
        }

        return Math.max(l,r);
    }

    private int traverse(TreeNode root, int depth, int sum, int maxDepth) {
        if(root.left==null&&root.right==null&&depth==maxDepth){
           return root.val;
        }

        int l=0;
        if(root.left!=null){
          l= traverse(root.left,depth+1,sum,maxDepth);
        }
        int r=0;
        if(root.right!=null){
           r=traverse(root.right,depth+1,sum,maxDepth);
        }
        return l+r;
    }
}

