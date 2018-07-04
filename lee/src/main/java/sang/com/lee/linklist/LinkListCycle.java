package sang.com.lee.linklist;

import sang.com.lee.BaseClass;

/**
 * 作者： ${PING} on 2018/7/3.
 */

public class LinkListCycle extends BaseClass {
    @Override
    public void test() {

    }

    public boolean hasCycle(ListNode head) {

        if (head==null||head.next==null){
            return false;
        }

        ListNode slow=head;
        ListNode fast=head.next;

        while (slow!=fast){
            if (slow==null||fast==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }

        return true;
    }
}
