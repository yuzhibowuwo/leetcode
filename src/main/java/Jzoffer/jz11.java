package Jzoffer;


import java.util.Arrays;

//最小值问题
public class jz11 {


    public int minArray(int[] numbers) {
        if(numbers.length==0||numbers==null)
            return 0;
        Arrays.sort(numbers);
        return numbers[0];
    }
    //二分查找
    public int minArrayEff(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }
}
