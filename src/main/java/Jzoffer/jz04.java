package Jzoffer;
// 二维数组中的查找
public class jz04 {


    public static boolean Find(int target, int[][] array) {
        //暴力方法，直接全量查询
        //优化，可以先确定某一行，因为target必然会大于等于array[I][0] 小于等于array[i][ARRAY[].LENTH]
        int nr=0;
        int cr=0;
        if(array.length==0||array==null||(array.length==1&&array[0].length==0))
            return false;
        for(;nr<array.length;nr++)
            if(array[nr][0]<=target&&array[nr][array[nr].length-1]>=target) {
                for (cr=0; cr < array[nr ].length; cr++)
                    if (target == array[nr ][cr])
                        return true;
            }
        //获取行坐标
        if(nr>=array.length)
            return false;

        return false;

    }

    public static void main(String[] args) {
        jz04 test=new jz04();
        int i[][]={{1,1}};
        jz04.Find(2,i);
    }
}
