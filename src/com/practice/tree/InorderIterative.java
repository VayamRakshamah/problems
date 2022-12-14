package com.practice.tree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderIterative {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }

    public class Solution {
        public ArrayList<Integer> inorderTraversal(TreeNode A) {
            Stack<TreeNode> st = new Stack<TreeNode>();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            TreeNode curr = A;
            while(st.size()>0 || curr!=null){
                while(curr!=null){
                    st.push(curr);
                    curr = curr.left;
                }
                curr = st.peek();
                st.pop();
                arr.add(curr.val);
                curr = curr.right;
            }
            return arr;
        }
    }
}
