package Jzoffer;
//打印从1到最大的n位数
public class jz17 {
    public int[] printNumbers(int n) {
        int lenth=(int)Math.pow(10,n);
        int []res=new int[lenth-1];
        for (int i=0;i<lenth-1;i++)
            res[i]=i+1;
        return res;
    }
}
