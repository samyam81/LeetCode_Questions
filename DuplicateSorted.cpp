class DuplicateSorted {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* current = head;

        while (current && current->next) {
            if (current->val == current->next->val) {
                ListNode* temp = current->next;
                current->next = temp->next;
                delete temp; 
            } else {
                current = current->next;
            }
        }
        
        return head;
    }
};

