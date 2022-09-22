package Jzoffer;
//链表，返回倒数第k个指针
public class jz22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //快慢指针的方式
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
    /*
           暴力方法，先统计链表长度，然后重新遍历，时间复杂度 on
           int n = 0;
        ListNode res = null;

        for (res = head; res != null; res = res.next) {
            n++;
        }
        for (res = head; n > k; n--) {
            res = res.next;
        }
        return res;*/

}
