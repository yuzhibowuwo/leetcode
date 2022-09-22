package Jzoffer;
//机器人的运动范围
public class jz13 {
    public int movingCount(int threshold, int rows, int cols) {
        int currentrows=0;
        int currentclos=0;
        int tempsum=0;
        for(currentrows=0;currentrows<rows;currentrows++)
            for(currentclos=0;currentclos<cols;currentclos++)
            {
                //先判断当前点，再判断任意一个点的上下左右，任意位true 如果不想要重复计算，就需要一个扩大的二维数组，用d[i][j]表示row-1，cls-1tempssum++

            }
        return tempsum;
    }
    //求各位数相加之和
    public int add(int numbers)
    {
        int res=0;
        if(numbers<10)
            return numbers;
        while(numbers!=0)
        {
            res+=numbers%10;
            numbers=numbers/10;
        }
        return res;
    }
    public boolean dfs(int threshold,int currow,int curcol,int rows,int cols)
    {
        if (curcol>=cols||currow>=rows||currow<0||curcol<0)
            return false;
        if ((add(currow)+add(curcol)>threshold))
            return false;
        else
        return true;
    }
}
