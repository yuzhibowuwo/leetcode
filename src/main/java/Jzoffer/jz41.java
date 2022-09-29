package Jzoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jz41 {
    List<Integer> temp=new ArrayList<Integer>();
    public jz41() {

    }

    public void addNum(int num) {
        temp.add(num);
    }
    //该方法时间超限
    public double findMedian() {
        double res=0.0;
        Integer []temparray=temp.toArray(new Integer[0]);
        Arrays.sort(temparray);
        int lenth=temparray.length;
        if(lenth%2==0)
            return (temparray[lenth/2]+temparray[(lenth/2)-1])/2.0;
        else
            return temparray[lenth/2];

    }
}