package com.practice.tree;
//You are given a Binary Tree A with N nodes.
//
//Write a function that returns the size of the largest subtree, which is also a Binary Search Tree (BST).
//
//If the complete Binary Tree is BST, then return the size of the whole tree.

public class LargestBSTSubtree {

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
    public int solve(TreeNode root) {
        return largestBSTSub(root)[2];
    }

    public int[] largestBSTSub(TreeNode root) {
        if (root == null){
            return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }
        if(root.left==null && root.right==null){
            return new int[] {root.val, root.val, 1};
        }

        int[] left = largestBSTSub(root.left);
        int[] right = largestBSTSub(root.right);

        int[] ans = new int[3];

        if(left[1]< root.val && root.val<right[0]){
            ans[0] = Math.min(left[0],Math.min(right[0], root.val));
            ans[1] = Math.max(left[1],Math.max(right[1], root.val));
            ans[2] = left[2]+right[2]+1;
            return ans;
        }

        ans[0] = Integer.MIN_VALUE;
        ans[1] = Integer.MAX_VALUE;
        ans[2] = Math.max(left[2], right[2]);

        return ans;
    }

}
