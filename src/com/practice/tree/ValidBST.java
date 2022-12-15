package com.practice.tree;

//You are given a binary tree represented by root A.
//
//Assume a BST is defined as follows:
//
//1) The left subtree of a node contains only nodes with keys less than the node's key.
//
//2) The right subtree of a node contains only nodes with keys greater than the node's key.
//
//3) Both the left and right subtrees must also be binary search trees.

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
    public int isValidBST(TreeNode root) {
        boolean val = isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(val){
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
