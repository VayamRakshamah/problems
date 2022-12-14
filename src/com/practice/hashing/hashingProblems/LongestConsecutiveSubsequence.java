package com.practice.hashing.hashingProblems;

import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSubsequence {

    public static int longestConsecutive(final List<Integer> A) {
        HashSet<Integer> set  = new HashSet<>();
        int ans = 0;

        //hash all
        for(int i=0;i<A.size();i++){
            set.add(A.get(i));
        }

        for(int i=0;i<A.size();i++){
            if(!set.contains(A.get(i)-1)){
                int j = A.get(i);
                while(set.contains(j)){
                    j++;
                }
                if(ans<j-A.get(i)){
                    ans = j-A.get(i);
                }
            }
        }

        return ans;

    }

    public static void main(String args[])
    {
        List<Integer> A = List.of( 1, 9, 3, 10, 4, 20, 2 );
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + longestConsecutive(A));
    }
}
