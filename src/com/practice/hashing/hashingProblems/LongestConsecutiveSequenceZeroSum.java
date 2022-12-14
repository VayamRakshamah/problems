package com.practice.hashing.hashingProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequenceZeroSum {


    public static void main(String[] args) {
        List<Integer> test1 = new ArrayList<>(List.of(1,2,-2,4,-4));
        List<Integer> test2 = new ArrayList<>(List.of(-19, 8, 2, -8, 19, 5, -2, -23));
        List<Integer>  result = longestConsecutive(test2);

        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }


    }
    public static ArrayList<Integer> longestConsecutive(List<Integer> A) {
        HashSet<Integer> set = new HashSet<>();
        int len_count = 0;

        int len_start = 0;
        int len_end = 0;

        //hash all
        for (int i = 0; i < A.size(); i++) {
            set.add(A.get(i));
        }

        for (int i = 0; i < A.size(); i++) {
            if(len_count>(A.size()-i)){
                break;
            }
            int sum = 0;
            int start = i;
            int end = -1 ;
            int x = i;
            int count = 0;
            int take_count = 0;
            while ( (x<A.size()) && set.contains(A.get(x)) ) {
                sum += A.get(x);
                count++;
                if (sum == 0) {
                    take_count = count;
                    end = x;
                }
                x++;
            }
            if(len_count<take_count && end>-1){
                len_count = take_count;
                len_start = start;
                len_end = end;

            }

        }
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int z=len_start; z<=len_end; z++){
            arrList.add(A.get(z));
        }

    return arrList;
    }
}
