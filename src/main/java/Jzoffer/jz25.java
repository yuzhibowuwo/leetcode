package Jzoffer;
//合并有序链表
public class jz25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(-1);
        ListNode res=temp;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {
                res.next=l1;
                l1=l1.next;
            }
            else
            {
                res.next=l2;
                l2=l2.next;
            }
            res=res.next;
        }
        if(l1!=null)
            res.next=l1;
        else if(l2!=null)
            res.next=l2;
        return temp.next;
    }
}
