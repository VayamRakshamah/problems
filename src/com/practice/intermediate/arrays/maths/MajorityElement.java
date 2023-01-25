package com.practice.intermediate.arrays.maths;

//Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
//You may assume that the array is non-empty and the majority element always exists in the array.

public class MajorityElement {
    public int majorityElement(final int[] A) {
        int N = A.length;
        int element = A[0];
        int frequency = 1;
        int count = 0;
        for(int i=1;i<N;i++){
            if(A[i]==element){
                frequency++;
            }
            else{
                if(frequency==0){
                    element = A[i];
                    frequency = 1;
                }
                else{
                    frequency--;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(A[i]==element){
                count++;
            }
        }
        if(count>(N/2)){
            return element;
        }
        else{
            return 0;
        }
    }
}
