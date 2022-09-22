package Jzoffer;

import java.util.Stack;

//反转链表
public class jz30 {
    Stack varstack=new Stack<Integer>();
    Stack minstack=new Stack<Integer>();
    public jz30() {

    }

    public void push(int x) {
        varstack.push(x);
        if(minstack.empty())
            minstack.push(Math.min((Integer) varstack.peek(), x));
        else
            minstack.push(Math.min((Integer) minstack.peek(), x));
    }

    public void pop() {
        varstack.pop();
        minstack.pop();
    }

    public int top() {
        return (int) varstack.peek();
    }

    public int min() {
        return (int) minstack.peek();
    }
}
