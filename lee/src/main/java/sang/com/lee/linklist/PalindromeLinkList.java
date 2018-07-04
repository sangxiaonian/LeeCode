package sang.com.lee.linklist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import sang.com.lee.BaseClass;

/**
 * 作者： ${PING} on 2018/7/4.
 * 请判断一个链表是否为回文链表。

 示例 1:

 输入: 1->2
 输出: false
 示例 2:

 输入: 1->2->2->1
 输出: true
 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */

public class PalindromeLinkList extends BaseClass {
    @Override
    public void test() {

    }


    public boolean isPalindrome(ListNode head) {

        Stack<ListNode> queue=new Stack<>();
        ListNode node=head;
        while (head!=null){
            queue.push(head);
            head=head.next;
        }
        while (node!=null){
            if (node.val!=queue.pop().val){
                return false;
            }
            node=node.next;
        }
        return true;

    }
}
