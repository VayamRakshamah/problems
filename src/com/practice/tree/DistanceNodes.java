package com.practice.tree;

import java.util.ArrayList;

//Given a binary tree of integers. All nodes in the binary tree have distinct values. You are given an integer B.
//
//You have to find all the nodes that are at a distance of exactly C from the node containing value B.
//
//Return an array of integers consisting all the nodes that are C distance from node containing value B.
public class DistanceNodes {
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

    //Path from root to X
    public boolean getPath(TreeNode root, int x, ArrayList<TreeNode> arr){
        if(root == null) return false;
        if(root.val == x){
            arr.add(root);
            return true;
        }
        if(getPath(root.left,x,arr) || getPath(root.right,x,arr)){
            arr.add(root);
            return true;
        }
        return false;
    }
    // node below a value S
    public ArrayList<Integer> below(TreeNode S, int k,ArrayList<Integer> distancelist){

        if(S==null){
            return distancelist;
        }
        if(k==0){
            distancelist.add(S.val);
            return distancelist;
        }
        below(S.left,k-1,distancelist);
        below(S.right,k-1,distancelist);

        return distancelist;
    }
    public ArrayList<Integer> solve(TreeNode A, int B, int C) {
        ArrayList<TreeNode> rootPath = new ArrayList<>();
        getPath(A,B,rootPath);
        ArrayList<Integer> distancelist = new ArrayList<>();
        below(rootPath.get(0),C,distancelist);
        for(int i=1;i<rootPath.size();i++){
            if(C-i==0){
                distancelist.add(rootPath.get(i).val);
            }
            if(rootPath.get(i).left == rootPath.get(i-1)){
                below(rootPath.get(i).right,C-i-1,distancelist);
            }
            else{
                below(rootPath.get(i).left,C-i-1,distancelist);
            }
        }
        return distancelist;
    }
}
