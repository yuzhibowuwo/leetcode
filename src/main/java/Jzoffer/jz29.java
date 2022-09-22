package Jzoffer;
//顺时针打印矩阵
public class jz29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0||matrix==null||matrix[0].length==0)
        return new int[0];

        int []res=new int[matrix.length*matrix[0].length];
        int resindex=0;
        int top=0,left=0,right=matrix[0].length-1,botton= matrix.length-1;
        while(top<=botton&&left<=right)
        {

            //上横行
            for(int temp=left;temp<=right;temp++)
            {res[resindex]=matrix[top][temp];resindex++;}
            //右竖行
            for(int temp=top+1;temp<=botton;temp++)
            {res[resindex]=matrix[temp][right];resindex++;}
            //下横行
            for(int temp=right-1;temp>left&&left < right && top < botton;temp--)
            {res[resindex]=matrix[botton][temp];resindex++;}
            //左竖行
            for(int temp=botton;temp>top&&left < right && top < botton;temp--)
            {res[resindex]=matrix[temp][left];resindex++;}

            top++;
            left++;
            right--;
            botton--;
        }
        return res;
    }
}
