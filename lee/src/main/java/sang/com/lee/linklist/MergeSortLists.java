package sang.com.lee.linklist;

import sang.com.lee.BaseClass;

/**
 * 作者： ${PING} on 2018/7/3.
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */

public class MergeSortLists extends BaseClass {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = null;
        if (l1==null&&l2==null){
            return null;
        }

        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }

        if (l1.val<l2.val){
            node=l1;
            node.next=mergeTwoLists(l1.next,l2);
        }else {
            node=l2;
            node.next=mergeTwoLists(l2.next,l1);
        }

        return node;


    }



    @Override
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoLists(null, l2);

        System.out.println(ListNodeUtils.getValue(listNode));


    }








}
