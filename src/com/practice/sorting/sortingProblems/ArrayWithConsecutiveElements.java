package com.practice.sorting.sortingProblems;

import java.util.ArrayList;

public class ArrayWithConsecutiveElements {

    public int solve(ArrayList<Integer> A) {
        int i=0,j=0,smallest=A.get(0),largest=A.get(0);
        while(i<A.size()){
            if(A.get(i)<smallest){
                smallest = A.get(i);
            }
            i++;
        }
        while(j<A.size()){
            if(A.get(j)>largest){
                largest = A.get(j);
            }
            j++;
        }
        int num = largest - smallest + 1;
        if(num == A.size()){
            int expected = num*(smallest+largest)/2;
            int actual =0;
            for(int x=0;x<A.size();x++) actual += A.get(x);
            if(actual==expected){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
