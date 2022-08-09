/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public TreeNode sortedListToBST(ListNode head) {
        int listsize=0;
        List<TreeNode>list=new ArrayList<>();
        while (head!=null){
            list.add(new TreeNode(head.val));
            head=head.next;
            listsize++;
        }
        return helper(list,0,listsize-1);
    }

    private TreeNode helper(List<TreeNode> list,int low,int high) {
        if(low>high){
            return null;
        }
        TreeNode root=new TreeNode();
        int mid=low+(high-low)/2;
        root=list.get(mid);
        root.left=helper(list,low,mid-1);
        root.right=helper(list,mid+1,high);
        return root;
    }
}





