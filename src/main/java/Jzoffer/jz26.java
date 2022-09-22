package Jzoffer;

//树的子结构，深度遍历
public class jz26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean res=false;
        if(A==null||B==null)
            return false;

        if(A.val==B.val)
        {
            isSubStructure(A.left,B.left);
            isSubStructure(A.right,B.right);

        }
        //遍历A树，找到跟B一样的节点。
        else
        {

        }


        return res;
    }



}
