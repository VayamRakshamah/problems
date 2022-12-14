package com.practice.sorting.sortingProblems;

public class InversionCount {

    //Brute Force O(N2)
    public int inversionCount(int [] A){
        int count = 0;
        for(int i = 0; i < A.length-1; i++){
            for(int j = 0; j < A.length;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public int inversionCountbetter(int[] A, int start, int end){
        //Base Case
        if(start>=end){
            return 0;
        }
        //recursive case
        int mid = (start+end)/2;
        int left = inversionCountbetter(A,start,mid);
        int right = inversionCountbetter(A,mid+1,end);
        int total = left+right+ mergeInversions(A,start,mid,end);
        return total;
    }

    private int mergeInversions(int[] A, int start, int mid, int end) {
        int count=0;
        int[]  temp = new int[A.length];
        int i = start;
        int j = mid+1;
        int k = start;
        while(i<=mid && j<=end){
            if(A[i]<A[j])
            {
                temp[k] = A[i];
                i++;
                k++;
            }
            else{
                temp[k] = A[j];
                //merge inversion
                count+=(mid-i+1);
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

        return count;

    }
}
