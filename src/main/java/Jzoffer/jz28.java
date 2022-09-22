package Jzoffer;
// 对称的二叉树
public class jz28 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)//(root.left==null&&root.right==null)||
            return true;
        boolean res=false;
        res=chekk(root,root);
        return res;
    }
    public boolean chekk(TreeNode left,TreeNode right)
    {   boolean res=false;
        if (left == null && right== null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if(left.val==right.val)
        {
           res= chekk(left.left,right.right)&&chekk(left.right,right.left);
        }
        else
            res=false;
        return res;
    }
}
