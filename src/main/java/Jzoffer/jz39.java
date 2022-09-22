package Jzoffer;

import java.util.HashMap;
import java.util.Map;

public class jz39 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> res=new HashMap<>();
        int temp=0;
        int halflenth=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            if(res.containsKey(nums[i])) {
                temp=res.get(nums[i]);
                temp++;
                if (halflenth<temp)
                    return nums[i];
                else
                    res.replace(nums[i],temp);
            }
            else
                res.put(nums[i],1);
        }
        return nums[0];
    }
}
