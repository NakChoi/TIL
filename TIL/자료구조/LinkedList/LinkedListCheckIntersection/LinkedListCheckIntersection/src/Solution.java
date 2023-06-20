public class Solution {

    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
            this.next = next;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

        ListNode aNode = headA;
        ListNode bNode = headB;

        while(aNode != bNode ){

            aNode = aNode == null ? headB : aNode.next;
            bNode = bNode == null ? headA : bNode.next;

        }

        return aNode;

    }
}
