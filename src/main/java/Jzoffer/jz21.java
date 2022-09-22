package Jzoffer;
//调整数组顺序使奇数位于偶数前面
public class jz21 {
    public int[] exchange(int[] nums) {

        int res[]=new int[nums.length];
        int right=0,left=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
            {
                res[right]=nums[i];
                right++;
            }
            else
            {
                res[left]=nums[i];
                left--;
            }
        }
        return res;
    }
}
