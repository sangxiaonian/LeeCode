package sang.com.lee.linklist;

import sang.com.lee.BaseClass;
import sang.com.lee.utils.SoutUtils;

/**
 * 作者： ${PING} on 2018/7/4.
 */

public class RemoveLinkedListElements extends BaseClass {
    @Override
    public void test() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        SoutUtils.sout(ListNodeUtils.getValue(removeElements(node, 2)));
    }


    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        ListNode node = head;
        ListNode next = node.next;
        while ( next != null) {
            if ( next.val==val){
                next=next.next;
                node.next=next;
            }else {
                next = next.next;
                node=node.next;
            }
        }

        if (head.val==val){
            head=head.next;
        }

        return head;

    }


}
