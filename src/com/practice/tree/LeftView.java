package com.practice.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class LeftView {

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

    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(A==null){
            return result;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(A);
        while(!que.isEmpty()){
            int n = que.size();

            for(int i = 0; i < n; i++){
                TreeNode fr = que.poll();
                if(i==0){
                    result.add(fr.val);
                }
                if(fr.left!=null){
                    que.add(fr.left);
                }
                if(fr.right!=null){
                    que.add(fr.right);
                }
            }
        }
        return result;
    }
}
