package com.practice.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
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

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>>  twoArr = new ArrayList<ArrayList<Integer>>();
        if(A==null){
            return twoArr;
        }
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(A);
        while(!que.isEmpty()){
            int n = que.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(que.peek().left!=null){
                    que.add(que.peek().left);
                }
                if(que.peek().right!=null){
                    que.add(que.peek().right);
                }
                level.add(que.remove().val);
            }
            twoArr.add(level);
        }
        return twoArr;
    }

}
