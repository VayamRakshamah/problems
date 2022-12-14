package com.practice.tree;

public class BalancedBinaryTree {

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
    public int isBalanced(TreeNode A) {
        int lHeight;
        int rHeight;

        if(A==null){
            return 1;
        }

        lHeight = height(A.left);
        rHeight = height(A.right);

        if(Math.abs(lHeight-rHeight)<=1 &&
                isBalanced(A.left)==1 &&
                isBalanced(A.right)==1){
            return 1;
        }
        return 0;
    }

    public int height(TreeNode H) {
        if(H==null){
            return -1;
        }
        int lHeight = height(H.left);
        int rHeight = height(H.right);

        return Math.max(lHeight,rHeight)+1;
    }
}
