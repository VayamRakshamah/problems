package com.practice.sorting.sortingProblems;

import java.util.ArrayList;

public class MaxMod {
    public int solve(ArrayList<Integer> A) {
        int j=0;
        int larger=A.get(0);
        int largest=A.get(0);
        while(j<A.size()){
            if(A.get(j)>largest ){
                larger = largest;
                largest = A.get(j);
            }
            else if(A.get(j)>larger && A.get(j)!=largest){
                larger = A.get(j);
            }
            j++;
        }
        return larger%largest;
    }
}
