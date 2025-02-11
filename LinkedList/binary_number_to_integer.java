import java.util.*; 
class binary_number_to_integer {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int l = getLength(head);
        int ans=0;
        for(int i=1; i<=l; i++){
            ans += temp.val*(Math.pow(2,l-i)); 
            temp=temp.next;
        }
        return ans;
    }

    public int getLength(ListNode head){
        if(head == null) {
            return 0;
        }
        return 1 + getLength(head.next);
    }
}