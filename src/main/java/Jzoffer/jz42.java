package Jzoffer;
//连续子数组的最大和
public class jz42 {
    //暴力方法，求出所有res[i]][j]的结果，即第i到第j位的和，球最大值。
    public int maxSubArray(int[] nums) {
        int i=0;
        int j=0;
        int [][]res=new int[nums.length][nums.length];
        int temp=0;
        int resInt=Integer.MIN_VALUE;
        if(nums.length<2)
            return nums[0];
        for(i=0;i<nums.length;i++)
        {   temp=nums[i];
            for (j = 0; j < nums.length; j++) {
                temp=temp+nums[j];
                res[i][j]=temp;
                resInt=Integer.max(res[i][j],resInt);
            }

        }
        return resInt;
    }
}
