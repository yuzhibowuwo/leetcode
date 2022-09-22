package Jzoffer;

import java.util.ArrayDeque;
import java.util.Deque;
//栈的压入是否能实现弹出序列
public class jz31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack=new ArrayDeque<Integer>();
        int indexpush=0;
        int indexpoped=0;
        for(indexpush=0;indexpush<pushed.length;indexpush++)
        {
            stack.push(pushed[indexpush]);

                 while(!stack.isEmpty()&&stack.peek() == popped[indexpoped])
                 {
                     stack.pop();
                     indexpoped++;
                 }

        }
        return stack.isEmpty();
    }
}
