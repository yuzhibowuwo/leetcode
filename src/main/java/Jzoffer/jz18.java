package Jzoffer;
//删除链表中的结点
public class jz18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val)
            return head.next;
        ListNode res=head;
        ListNode cur=head.next;

        while(cur!=null&&cur.val!=val) {
            res = cur;
            cur=cur.next;
        }
        if (cur!=null)
        res.next=cur.next;
        return res;
    }
}
