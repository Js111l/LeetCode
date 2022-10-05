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
    public boolean hasCycle(ListNode head) {
        
        
        

        ListNode node = head;
        HashMap<ListNode,Boolean> visited=new HashMap<>();
        while (node != null) {   //traverse all nodes
            if(visited.get(node)==null){ //if node hasn't been visited yet, add it to map.
                visited.put(node,true);
                node=node.next;
            }else         //if node has been visited already -> there is a cycle. Return true.
                return true;
        }
        return false;
    }


    }
