/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode node = head;
        HashMap<ListNode,Boolean> visited=new HashMap<>();
        while (node != null) {
            if(visited.get(node)==null){
                visited.put(node,true);
                                node=node.next;
            }else 
                return node;

        }
        return null;
    }

}

