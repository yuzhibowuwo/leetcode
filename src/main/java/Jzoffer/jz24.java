package Jzoffer;
//反转链表
public class jz24 {
    //头插法反转链表
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return head;
        ListNode res=null;
        ListNode cur=head;
        while(cur!=null)
        {//1 2 3 4
            ListNode temp=cur.next; //2
            cur.next=res; //1->null
            res=cur;//res=1->null->2 3 4
            cur=temp;//cur= 2 3 4;
        }
        return res;
    }
}
