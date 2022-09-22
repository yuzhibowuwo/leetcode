package Jzoffer;

//矩阵中的路径
public class jz12 {
    public boolean hasPath (char[][] matrix, String word) {
        // write code here
        int i=0,j=0;
        int indexWord=0;
        for(i=0;i<matrix.length;i++)
            for(;j<matrix[i].length;j++)
                if(matrix[i][j]==word.charAt(indexWord))
                {
                    indexWord++;
                    //后续需要判断这个字母的上下左右四个是否与word.charAt 相等，不相等则回退。dfs深度搜索
                }
        return false;
    }
}
