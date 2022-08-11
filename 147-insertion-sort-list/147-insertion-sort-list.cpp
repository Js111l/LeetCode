/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode *insertionSortList(ListNode *head) {
    ListNode *current=head;
        while (current!=NULL) {
                for (ListNode *j = head; j != current; j = j->next) {
                    if (j->val > current->val) {
                        int temp = current->val;
                        current->val = j->val;
                        j->val = temp;
                    }
                }
              current=current->next;
        }
        return head;
    }
};