package com.practice.tree;

import java.util.ArrayList;

//Find the lowest common ancestor in an unordered binary tree A, given two values, B and C, in the tree.
//
//Lowest common ancestor: the lowest common ancestor (LCA) of two nodes and w in a tree or directed acyclic graph (DAG) is the lowest (i.e., deepest) node that has both v and w as descendants.
public class LCAncestor {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    static ArrayList<Integer> pathB = new ArrayList<>();
    static ArrayList<Integer> pathC = new ArrayList<>();

    public static int lca(TreeNode A, int B, int C) {

        // traverse the path to B and store in listB
        boolean b = getPath(A,B,pathB);
        // traverse the path to C and store in listC
        boolean c = getPath(A,C,pathC);

        //check if both exist in tree
        if(!b||!c){
            return -1;
        }
        // traverse the lists in reverse order and get the last matching data

        int common = 0;
        int i = pathB.size()-1;
        int j = pathC.size()-1;

        while(i>=0 && j>=0){
            if(pathB.get(i)==pathC.get(j)){
                common = pathC.get(j);
            }
            else{
                break;
            }
            i--;
            j--;
        }

        return common;
    }

    public static boolean getPath(TreeNode root, int x, ArrayList<Integer> arr){
        if(root == null) return false;
        if(root.val == x){
            arr.add(root.val);
            return true;
        }
        if(getPath(root.left,x,arr) || getPath(root.right,x,arr)){
            arr.add(root.val);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root =  new TreeNode(50);
        root.left = new TreeNode(75);
        root.right = new TreeNode(45);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(33);
        root.right.left = new TreeNode(51);
        root.right.right = new TreeNode(99);
        System.out.println("LCA is "
                + lca(root,40,99));
    }
}
