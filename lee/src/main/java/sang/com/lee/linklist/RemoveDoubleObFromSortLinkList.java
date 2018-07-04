package sang.com.lee.linklist;

import sang.com.lee.BaseClass;
import sang.com.lee.utils.SoutUtils;

/**
 * 作者： ${PING} on 2018/7/3.
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */

public class RemoveDoubleObFromSortLinkList extends BaseClass {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = head;
        while (head != null&&head.next!=null) {
            if (head.val==head.next.val){
                head.next=head.next.next;
            }else {
                head=head.next;
            }
        }
        return result;
    }


    @Override
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
//        l1.next.next.next = new ListNode(3);
//        l1.next.next.next.next = new ListNode(3);

        SoutUtils.sout(ListNodeUtils.getValue(deleteDuplicates(l1)));
    }
}
