package Jzoffer;

import java.util.ArrayList;
import java.util.Stack;
//链表反序输出
public class jz06 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<Integer> temp=new Stack<Integer>();
        while(listNode!=null)
        {
            temp.push(listNode.val);
            listNode=listNode.next;
        }
        while(!temp.isEmpty())
            res.add(temp.pop());
        return res;

    }
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<Integer> temp=new Stack<Integer>();
        while(head!=null)
        {
            temp.push(head.val);
            head=head.next;
        }
        while(!temp.isEmpty())
            res.add(temp.pop());
        int []resarray=new int[res.size()];
        for(int index=0;index<res.size();index++)
            resarray[index]=res.get(index);
        return resarray;
    }
}
