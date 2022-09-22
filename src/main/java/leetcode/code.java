package leetcode;

import java.util.ArrayList;
import java.util.List;

public class code {

    public static void leet1839() {
    }

    public static void leet1614()
    {

    }
//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
//你可以按 任何顺序 返回答案。
public List<List<Integer>> leet77(int n, int k) {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    return ans;
}


    public static void leetms08()
    {

    }
    public static void leetoffer32()
    {

    }
    public static void leet994()
    {

    }
    public static void leet204()
    {

    }
    public static void leet322()
    {

    }
    static void dfs(char[][] grid, int r, int c) {
        //深度搜索
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
    //dfs算法
    public static int leet200(char[][] grid)
    {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }
    public static void main(String[] args) {

    }
}
