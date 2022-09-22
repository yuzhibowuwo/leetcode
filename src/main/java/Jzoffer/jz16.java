package Jzoffer;
//计算x的n次幂
public class jz16 {
    //官方题解
    public double myPow(double x, int n) {
        double x_contribute = x;
        if(n==0)
            return 1.0;
        if(n<0&&n!=Integer.MIN_VALUE) {
            n = -n;
            x_contribute=1/x_contribute;
        }
        if(n==Integer.MIN_VALUE &&x >1.0)
            return 0.0;
        //        System.out.println(Math.pow(2.0,Integer.MIN_VALUE));//0.0
        //        System.out.println(Math.pow(1.0,Integer.MIN_VALUE));//1.0
        //分治法
        double res=1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                res *= x_contribute;
            }
            // 将贡献不断地平方
            x_contribute *= x_contribute;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            n /= 2;
        }
        return res;

    }

    public double quickMul(double x, long N) {
        double ans = 1.0;
        // 贡献的初始值为 x
        double x_contribute = x;
        // 在对 N 进行二进制拆分的同时计算答案
        while (N > 0) {
            if (N % 2 == 1) {
                // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                ans *= x_contribute;
            }
            // 将贡献不断地平方
            x_contribute *= x_contribute;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            N /= 2;
        }
        return ans;
    }
    /** 1.00000
     2147483647 超时 暴力的方法 暴力方法
     *     double res=1.0;
     *     int nabs=0;
     *         if(n==0)
     *         return 1.0;
     *         if(n<0)
     *             nabs=0-n;
     *         else
     *             nabs=n;
     *     for(int i=0;i<nabs;i++)
     *         res=res*x;
     *     if(n<0)
     *         return 1.0/res;
     *     return res;
     *     //优化
     *         if( n < 0){
     *             x = 1 / x;
     *             n = - n;
     *         }
     *         double res = 1.0;
     *         //累乘
     *         for(int i = 0; i < n; i++)
     *             res *= x;
     *         return res;
     *
     *     **/

    /**
     1.00000
     -2147483648 超时
     * if(n==0)
     return 1.0;
     if(n<0) {
     n = -n;
     x=1/x;
     }
     //分治法
     double res=1.0;
     while(n!=0){
     if((n&1)!=0)
     res=res*x;
     x*=x;
     n=n>>1;}
     return res;
     * **/

    //官方答案
    /** public double myPow(double x, int n) {
     long N = n;
     return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
     }

     public double quickMul(double x, long N) {
     double ans = 1.0;
     // 贡献的初始值为 x
     double x_contribute = x;
     // 在对 N 进行二进制拆分的同时计算答案
     while (N > 0) {
     if (N % 2 == 1) {
     // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
     ans *= x_contribute;
     }
     // 将贡献不断地平方
     x_contribute *= x_contribute;
     // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
     N /= 2;
     }
     return ans;
     }**/
}
