public class merge_two_sorted_list {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode ans = new ListNode();
        ListNode temp = ans;

        while(temp1!=null && temp2!=null){
            if(temp1.val > temp2.val){
                temp.next = temp2;
                temp2 = temp2.next;
            }
            else{
                temp.next = temp1;
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        temp.next = (temp1 != null) ? temp1:temp2;
        return ans.next;
    }
}