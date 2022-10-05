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
        List<ListNode> list=new ArrayList<>();
        while (head != null) {
            if(!list.contains(head)){
                list.add(head);
                head = head.next;
            }else {
               return list.get(list.indexOf(head));
            }
        }
        return null;
    }
}
