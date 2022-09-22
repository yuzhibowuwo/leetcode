package Jzoffer;

import java.util.HashMap;

// 数组中重复的数字
public class jz03 {
    public int duplicate (int[] numbers) {
        // write code here

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] > numbers.length - 1 || numbers[i] < 0)
                return -1;
            else
                if(map.containsKey(numbers[i]))
                    return numbers[i];
                else map.put(numbers[i],0);
        }
        return -1;
    }

}
