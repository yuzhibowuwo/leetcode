package Jzoffer;
//二进制中1的个数
public class jz15 {
    public int NumberOf1(int n) {
       String s= Integer.toBinaryString(n);
       int res=0;
       for(int i=0;i<s.length();i++)
           if(s.charAt(i)=='1')
               res++;
       return res;
    }
}
