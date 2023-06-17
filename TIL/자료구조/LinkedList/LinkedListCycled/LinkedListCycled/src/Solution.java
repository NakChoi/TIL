public class Solution {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = null;
        }


    }
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(slowPointer.next != null && fastPointer.next != null){

            if(fastPointer.next.next == null) return false;

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                return true;
            }
        }

        return false;
    }
}