package com.practice.sorting;

import static com.practice.sorting.BubbleSort.swap;

//TC -- avg case O(NlogN)
//TC -- worst case O(N2)
//SC -- avg case O(logN)
//SC -- worst case O(N)
public class QuickSort {
    public void quickSort(int[] A,int start, int end){
        //base case
        if(start>=end){
            return;
        }
        //recursive case
        int p = partition(A,start,end);
        quickSort(A,start,p-1);
        quickSort(A,p+1,end);
    }
    public int partition(int[] A,int start,int end){
        int pivot = A[end];
        int i = start-1;
        for(int j=start;j<=end-1;j++){
            if(A[j]<pivot){
                i++;
                swap(A[i],A[j]);
            }
        }
        swap(A[end],A[i+1]);
        //pivots position
        return i+1;
    }

    public static void swap(int num1, int num2){
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
    }
}
