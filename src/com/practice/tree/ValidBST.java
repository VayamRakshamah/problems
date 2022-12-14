package com.practice.tree;

public class ValidBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    public int isValidBST(TreeNode A) {
        boolean val = isBST(A,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(val==true){
            return 1;
        }
        else{
            return 0;
        }
    }

    private boolean isBST(TreeNode root, int s, int e) {
        if(root==null){return true;}
        if(s<=root.val && root.val<=e){
            boolean l = isBST(root.left,s,root.val-1);
            boolean r = isBST(root.right,root.val+1,e);
            return l && r;
        }
        else{
            return false;
        }
    }
}
