package com.practice.sorting.sortingProblems;

import java.util.ArrayList;
import java.util.List;

public class SortedMerge {

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int lenA = A.size();
        int lenB = B.size();
        int i = 0;
        int j = 0;
        while (i < lenA && j < lenB) {
            if(A.get(i)<B.get(j)) {
                result.add(A.get(i));
            }
            else{
                result.add(B.get(j));
            }
        }
        while(i<lenA){
            result.add(A.get(i));
        }
        while(j<lenB){
            result.add(B.get(j));
        }

        return result;
    }
}
