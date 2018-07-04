package sang.com.lee.linklist;

import java.util.Random;

/**
 * 作者： ${PING} on 2018/7/3.
 */

public class ListNodeUtils {
    public static String getValue(ListNode node) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (node != null) {

            builder.append(node.val);
            node = node.next;
            if (node != null) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * 随机创建一个单项链表
     *
     * @return
     */
    public static ListNode creatNode(int size) {
        ListNode listNode = new ListNode(new Random().nextInt(5));
        ListNode cuttent = listNode;
        for (int i = 0; i < size; i++) {
            cuttent.next = new ListNode(listNode.val + new Random().nextInt(5));
            cuttent = cuttent.next;
        }
        return listNode;
    }
}
