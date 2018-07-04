package sang.com.lee.linklist;

import java.util.HashSet;

import sang.com.lee.BaseClass;
import sang.com.lee.utils.SoutUtils;

/**
 * 作者： ${PING} on 2018/7/4.
 * 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */

public class ReverseLinkList extends BaseClass {
    @Override
    public void test() {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        SoutUtils.sout(ListNodeUtils.getValue(reverseList(node)));
    }

    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode current=head ;
        ListNode next = null;
        ListNode temp = current.next;
        while (temp!=null ){
            temp=current.next;
            current.next=next;
            next=current;
            if (temp!=null){
                current=temp;
            }
        }
        head.next=null;
        return current;


    }

}
