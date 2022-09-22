package Jzoffer;

import java.util.Arrays;

public class jz40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int []res=new int[k];
        for(int index=0;index<=(k-1);index++)
            res[index]=arr[index];
        return res;
    }
}
