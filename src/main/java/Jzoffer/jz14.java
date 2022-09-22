package Jzoffer;
//尖绳子问题，用均值不等式
public class jz14 {
    public int cutRope (int n) {
    //不超过3直接计算
        if(n <= 3)
            return n - 1;
        int res = 1;
        while(n > 4){
        //连续乘3
        res *= 3;
            n -= 3;
        }
        return res * n;
    }
}

//支付宝二维码支付宝扫码 输入金额/ui 调单
