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
    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> max = new HashMap<>();
        helper(root, 1, max);
        Integer level=checkMaxValue(max);
                max.entrySet().stream().forEach(x-> System.out.println(x.getKey()+ " "+x.getValue()));

        return level;
    }

    private Integer checkMaxValue(Map<Integer, Integer> max) {
        Integer maxLevel=1;
        Set<Integer> set=max.keySet();
        for (Integer numb:set
             ) {
            if(max.get(numb)>max.get(maxLevel)){
                maxLevel=numb;
            }
            System.out.println(maxLevel);
        }
        return maxLevel;
    }


    private void helper(TreeNode root, int level, Map<Integer, Integer> max) {
        if (root == null) {
          return;
        }
        max.put(level,max.getOrDefault(level,0)+root.val);
        if(root.left!=null){
            helper(root.left,level+1,max);
        }
        if(root.right!=null){
            helper(root.right,level+1,max);
        }
    }
}
