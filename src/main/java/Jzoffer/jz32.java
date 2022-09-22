package Jzoffer;

import java.util.ArrayList;
import java.util.List;

//从上到下打印二叉树 按照层输出，添加到数组中
public class jz32 {
    List<Integer>temp=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<TreeNode>tempnode=new ArrayList<>();

    public int[] levelOrder(TreeNode root) {

        if(root==null)
            return new int[0];
        getvalue(root);
        int []res=new int[temp.size()];
        for(int i=0;i<temp.size();i++)
        {
            res[i]=temp.get(i);
        }
        return  res;
    }
    public void getvalue(TreeNode root)
    {
        if(root!=null)
            temp.add(root.val);
        if(root.left!=null)
            getvalue(root.left);
        if(root.right!=null)
            getvalue(root.right);

    }
    //按层逐行输出
    public List<List<Integer>> levelOrderanceng(TreeNode root) {
        return  res;
    }
    //之字形输出按层输出
    public List<List<Integer>> levelOrderzhizixing(TreeNode root) {
        return  res;
    }
}
