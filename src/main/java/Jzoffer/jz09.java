package Jzoffer;

import java.util.Stack;
//两个堆栈实现队列
public class jz09 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        while(!stack1.empty())
            stack2.push(stack1.pop());
        int res = stack2.pop();
        //再将第二个栈的元素放回第一个栈
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());
        return res;
    }
}
