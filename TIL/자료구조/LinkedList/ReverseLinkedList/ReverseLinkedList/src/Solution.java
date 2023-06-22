public class Solution {

     public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode reverseList(ListNode head) {

        if(head == null) return null;

        ListNode original_head = head;

        ListNode present_head = head;


        while(original_head.next != null){

            // 헤드가 될 노드 세팅
            ListNode new_head = original_head.next;

            // 헤드가 될 노드의 원래 다음 노드 세팅
            original_head.next = new_head.next;

            // 새로운 헤드가될 노드의 next를 현재의 노드로 바꿔준 다음에, 새로운 헤드를 현재 노드로 바꿔주는 작업
            new_head.next = present_head;

            present_head = new_head;


        }

        return present_head;

    }
}
