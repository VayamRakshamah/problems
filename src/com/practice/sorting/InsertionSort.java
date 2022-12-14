package com.practice.sorting;

//Insert the array in its correct position
//TC :- O(n2)
//SC :- O(1)
public class InsertionSort {

    int[] arr = {5,1,3,2,7};

    public void insertionSort(int[] arr){

        int n = arr.length;

        for(int i=1;i<n;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }
}
