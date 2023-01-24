package com.practice.intermediate.arrays.subarray;

//Given an array of size N, find the subarray of size K with the least average.

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithLeastAverage {
    public static int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum =0;
        int average =A.get(0);
        int leastAverage=A.get(0);
        int index = -1;
        int startIndex = -1;
        ArrayList<Integer> Pfix = new ArrayList<Integer>();
        // Prefix sum array
        for (int i = 0; i < N; i++) {
            if(i==0){
                Pfix.add(A.get(i));
            }
            else{
                Pfix.add(Pfix.get(i-1)+A.get(i));
            }
        }
        // Sum and average calculation ** mark the start index
        for (int i = 0; i < N-B; i++) {
            if(i==0){
                sum = Pfix.get(i+B-1);
            }
            else{
                sum = Pfix.get(i+B-1)-Pfix.get(i-1);
            }
            average = sum/B;
            index = i;
            if(average<=leastAverage){
                leastAverage = average;
                startIndex = index;
            }
        }
        return startIndex;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19));
//        int B =1;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18));
        int B =6;
        System.out.println(solve(A,B));
    }
}
