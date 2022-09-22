package Jzoffer;

public class jz10 {
    //斐波那契
    public int fib(int n) {
        int a=0,b=1,res=0;
        int index=0;
        if(n<2)
            return n;
        for (;index<n;index++)
        {
            res=(a+b)%1000000007;
            b=a;
            a=res;
        }
        return res;
    }
    public int dongtaiguihuafib(int n)
    {
        int dp0=0,dp1=1;
        int dp[]=new int[n+1];

        dp[0]=0;dp[1]=1;
        if(n<2)
            return dp[n];
        for(int i=2;i<n;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
    //青蛙问题
    public int numWays(int n) {
        if(n<2)
            return 1;
        int dp[]=new int[n+1];
        dp[0]=1;dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
