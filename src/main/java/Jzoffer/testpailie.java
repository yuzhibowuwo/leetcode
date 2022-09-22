package Jzoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testpailie {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // ��������������
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            // ��̬ά������
            Collections.swap(output, first, i);
            // �����ݹ�����һ����
            backtrack(n, output, res, first + 1);
            // ��������
            Collections.swap(output, first, i);
        }
    }

    List<Integer> temp = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k,int []element) {
        dfs(1, n, k,element);
        return ans;
    }

    public void dfs(int cur, int n, int k,int []element) {
        // ��֦��temp ���ȼ������� [cur, n] �ĳ���С�� k�������ܹ��������Ϊ k �� temp
        if (temp.size() + (n - cur + 1) < k) {
            return;
        }
        // ��¼�Ϸ��Ĵ�
        if (temp.size() == k) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        // ����ѡ��ǰλ��
        temp.add(element[cur]);
        dfs(cur + 1, n, k, element);
        temp.remove(temp.size() - 1);
        // ���ǲ�ѡ��ǰλ��
        dfs(cur + 1, n, k,element);
    }


}
