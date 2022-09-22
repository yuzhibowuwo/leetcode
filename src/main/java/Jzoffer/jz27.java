package Jzoffer;
//二叉树左右结点调换，二叉树递归遍历
public class jz27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)//(root.left==null&&root.right==null)||
            return root;
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorTree(root.left);
        mirrorTree(temp);
        return root;
    }

}
