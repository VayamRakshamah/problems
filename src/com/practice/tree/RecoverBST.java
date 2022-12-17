package com.practice.tree;

import java.util.ArrayList;

//Two elements of a binary search tree (BST), represented by root A are swapped by mistake. Tell us the 2 values swapping which the tree will be restored.
//
//A solution using O(n) space is pretty straightforward. Could you devise a constant space solution?
public class RecoverBST {

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

    TreeNode first = null;
    TreeNode second = null;
    TreeNode previous = null;
    public ArrayList<Integer> recoverTree(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        modInorder(A);
        result.add(second.val);
        result.add(first.val);
        return result;

    }
    public void modInorder(TreeNode root){
        if(root == null){return;}
        modInorder(root.left);
        if(previous!=null && previous.val>root.val){
            if(first==null){
                first = previous;
                second = root;
            }
            else{
                second = root;
            }
        }
        previous=root;
        modInorder(root.right);
    }

}