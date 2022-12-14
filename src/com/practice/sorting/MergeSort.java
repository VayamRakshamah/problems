package com.practice.sorting;

//TC: O(N*logN)
//SC: O(N)
public class MergeSort {

    public void mergeSort(int[] A,int start, int end){
        //base case
        if(start>=end){
            return;
        }
        //recursive case
        int mid = (start+end)/2;
        mergeSort(A,start,mid);
        mergeSort(A,mid+1,end);
        merge(A,start,mid,end);

    }
    public void merge(int[] A,int start, int mid, int end){
        int[] temp = new int[A.length];
        int i = start;
        int j = mid+1;
        int k = start;

        while(i<=mid && j<=end){
            if(A[i]<A[j]){
                temp[k] = A[i];
                i++;
                k++;
            }
            else{
                temp[k] = A[j];
                j++;
                k++;
            }
        }

        //Copy remaining elements
        while(i<=mid){
            temp[k]=A[i];
            i++;
            k++;
        }
        //Copy remaining elements
        while(j<=end){
            temp[k] = A[j];
            j++;
            k++;
        }
        //Copy to original array
        for(int x = start;x<=end;x++){
            A[x] = temp[x];
        }
    }
}
