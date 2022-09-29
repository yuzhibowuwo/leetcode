package Jzoffer;

public class jz43 {
    //1+10^n
    //该方式超时
    public int countDigitOne(int n) {
        int res=0;
        int temp=0;
        for(;temp<=n;temp++) {
            String tempstring=Integer.toString(temp);
            for(int index=0;index<tempstring.length();index++)
            {
                if(tempstring.charAt(index)=='1')
                    res++;
            }
        }


        return res;
    }
}
