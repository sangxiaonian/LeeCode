package sang.com.lee.linklist;

import java.awt.Label;
import java.util.HashSet;
import java.util.List;

import sang.com.lee.BaseClass;
import sang.com.lee.utils.SoutUtils;

/**
 * 作者： ${PING} on 2018/7/4.
 * 编写一个程序，找到两个单链表相交的起始节点。
 * <p>
 * <p>
 * <p>
 * 例如，下面的两个链表：
 * <p>
 * A:          a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B:     b1 → b2 → b3
 * 在节点 c1 开始相交。
 * <p>
 * <p>
 * <p>
 * 注意：
 * <p>
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */

public class IntersectionOfTowLinkedList extends BaseClass {
    @Override
    public void test() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

//        ListNode headB = new ListNode(1);
        ListNode headB = headA.next;
//        headB.next = new ListNode(1);
//        headB.next.next = new ListNode(1);
        ListNode intersectionNode = getIntersectionNode(headA, headB);

        SoutUtils.sout(ListNodeUtils.getValue(intersectionNode));

    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == headB) {
            return headA;
        }
        if (headA == null || headB == null) {
            return null;
        }

        int sumA = 0, sumB = 0;
        ListNode tempA = headA;
        while (tempA.next != null) {
            tempA = tempA.next;
            sumA++;
        }
        ListNode tempB = headB;
        while (tempB.next != null) {
            tempB = tempB.next;
            sumB++;
        }
        if (tempA == tempB) {
            ListNode tempMax;
            ListNode tempMin;
            if (sumA > sumB) {
                tempMax = headA;
                tempMin = headB;
            }else {
                tempMin = headA;
                tempMax = headB;
            }
            int abs = Math.abs(sumA - sumB);
            for (int i = 0; i < abs; i++) {
                tempMax=tempMax.next;
            }

            while (tempMax!=tempMin){
                tempMax=tempMax.next;
                tempMin=tempMin.next;
            }
            return tempMax;
        }else {
            return null;
        }
    }


}
