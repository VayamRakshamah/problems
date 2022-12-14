package com.practice.tree;

import java.util.*;

public class BottomView {

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

    public class Pair{
        TreeNode tNode;
        int value;

        Pair(TreeNode node, int val){
            tNode = node;
            value= val;
        }
    }

    public ArrayList<Integer> solve(TreeNode A) {
        int minL=0;
        int maxL=0;
        ArrayList<Integer> oneD = new ArrayList<Integer>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(A,0));
        while(q.size()>0){
            Pair data  = q.peek();
            q.remove();
            TreeNode temp = data.tNode;
            int l = data.value;
            if(hm.containsKey(l)){
                hm.get(l).add(temp.val); // push the val inside list for level l
            }
            else{
                hm.put(l, new ArrayList<>(Arrays.asList(temp.val)));
            }

            minL = Math.min(l,minL);
            maxL = Math.max(l,maxL);
            if(temp.left!=null){
                q.add(new Pair(temp.left,l-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,l+1));
            }
        }
        for(int i=minL;i<=maxL;i++){
            ArrayList<Integer> hmLst = hm.get(i);
            oneD.add(hmLst.get(hmLst.size()-1));
        }
        return oneD;
    }
}
