package com.practice.sorting;

public class Mergetest {

    public void mergesort(int[] A, int start, int end){
        if(start>=end){
            return;
        }

        int mid = (start+end)/2;
        mergesort(A, start, mid);
        mergesort(A, mid+1, end);
        merge(A,start,mid,end);

    }

    private void merge(int[] A, int start, int mid, int end) {
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

        while(i<=mid){
            temp[k] = A[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k] = A[j];
            j++;
            k++;
        }

        for(int x = start;x<=end;x++){
            A[x] = temp[x];
        }
    }
}
