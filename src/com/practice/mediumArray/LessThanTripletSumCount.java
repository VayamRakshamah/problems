package com.practice.mediumArray;
//Given an array of distinct integers and a sum value.
// Find count of triplets with sum smaller than given sum value.
// The expected Time Complexity is O(n2).

import java.util.Arrays;

public class LessThanTripletSumCount {

    private static int  countTripletSum(int[] arr, int sum) {
        int count = 0;
        int len = arr.length;

        int i=0;
        int j = i+1;
        int k = i+2;

        //sort

        Arrays.sort(arr);

        //search triplet
        while(i<len-2  ){
            if(arr[i]+arr[j]+arr[k] < sum ){
                count++;
                if(k<len-1){
                    k++;
                }
                else if(k==len-1){
                    if(j<len-2){
                        j++;
                        k=j+1;
                    }
                    else if(j==len-2){
                        if(i<len-1){
                            i++;
                            j=i+1;
                            k=i+2;
                        }
                    }

                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7};
        int sum = 12;
        System.out.println(countTripletSum(arr,sum));
    }

}
