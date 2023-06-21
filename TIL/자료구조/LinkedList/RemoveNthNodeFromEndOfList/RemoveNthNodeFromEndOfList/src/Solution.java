

public class Solution {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = head;
        int len = 0;


          // 총 Node 길이 구하기
        while (node != null) {

            node = node.next;
            len++;
        }

        // 총 길이가 1일때
        if(len == 1) return null;

        // 총길이 = len 뒤에서 n 번째인 노드는?  : 총길이 - (n-1)

        // 왜냐하면 타겟 노드 전의 노드에서 처리해야하기 때문
        int target_node_idx = len - n;

        if(target_node_idx == 0) {
            head = head.next;

            return head;
        }
        int idx = 1;

        node = head;

        // 타겟 노드에서 next에 그 다음 노드 삽입하기.
        while (idx <= target_node_idx) {

            if(idx == target_node_idx){
                node.next = node.next.next;
                break;
            }

            node = node.next;
            idx++;
        }


        return head;




    }
}
