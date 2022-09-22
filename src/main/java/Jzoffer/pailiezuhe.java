package Jzoffer;

import java.util.ArrayList;
import java.util.List;

public class pailiezuhe {
    List<Integer>temp=new ArrayList<Integer >();
    public List<List<Integer>> respailie=new ArrayList<List<Integer>>();
    public List<List<Integer>> pailie(int []elemet, int targetlenth)
    {

        int slowindex=0;
        int quickindex=1;

        for (slowindex=0;slowindex<=elemet.length-targetlenth;slowindex++)
        {
            temp.add(elemet[slowindex]);
            if (temp.size()==targetlenth) {
                respailie.add(new ArrayList<>(temp));//必须使用new的方法，否则每次修改temp的数据时会影响respailie的数据
                temp.remove(temp.size()-1);
            }
            else {
                quickindex=slowindex+1;
                while(quickindex< elemet.length)
                {
                    if (temp.size()==targetlenth)
                    {
                        respailie.add(new ArrayList<>(temp));//必须使用new的方法，否则每次修改temp的数据时会影响respailie的数据
                        temp.remove(temp.size()-1);
                    }
                    else {
                        temp.add(elemet[quickindex] );
                        quickindex++;
                    }
                }
                temp.clear();
            }

        }
        //dfs(slowindex,quickindex,elemet,target);

        return respailie;


    }

    //传入参数，开始位置，当前位置，需要组合的元素，目标长度
 /*   public static void dfs(int start, int cur, int[] element, int target)
    {
        //剩余元素长度已经不足够新增加组合了
        if(element.length+ (start-cur+1)<target)
            return ;
        if(temp.size()==target) {
            respailie.add(new ArrayList<>(temp));
        System.out.println(temp.get(0));
        }
        temp.add(element[cur]);
        dfs(start, cur+1,element, target);
        temp.remove(temp.size() - 1);
        // 考虑不选择当前位置
        dfs(cur+1, cur+1,element, target);



    }*/
    //输入函数 targetsize：目标长度，index当前位置
    public void combine(int targetsize,int index,int[]nums)
    {
        if(temp.size()==targetsize)
        {
            respailie.add(new ArrayList<>(temp));
            return ;
        }
        else {
            for (int i = index; i < nums.length; i++) {
                temp.add(nums[i]);
                combine(targetsize, i + 1, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }


}
