class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode nxt;
        ListNode curr= head;
        
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        
        return prev;
    }
}
