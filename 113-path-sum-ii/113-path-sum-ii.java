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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        Stack<Integer>list=new Stack<>();
        List<List<Integer>> res=new ArrayList<>();
        int i=0;
        helper(root,targetSum,list,res);
      return res;
    }

    private void helper(TreeNode root, int targetSum, Stack<Integer> pathSum, List<List<Integer>>listResult) {

    if(root==null)
    {
        return;
    }
    pathSum.push(root.val);
    if(root.left==null&&root.right==null&&targetSum==root.val){
        listResult.add(pathSum.stream().map(x->x).collect(Collectors.toList()));
    }
    helper(root.left,targetSum-root.val,pathSum,listResult);
    helper(root.right,targetSum-root.val,pathSum,listResult);
    pathSum.pop();

    }
}