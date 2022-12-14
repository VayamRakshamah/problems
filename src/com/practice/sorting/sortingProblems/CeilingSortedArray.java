package com.practice.sorting.sortingProblems;

import java.util.Arrays;

//Given a sorted array and a value x, the ceiling of x is the smallest element in an array greater than or equal to x,
// and the floor is the greatest element smaller than or equal to x. Assume that the array is sorted in non-decreasing order.
// Write efficient functions to find the floor and ceiling of x.
public class CeilingSortedArray {

    private static int[] ceilfloor(int[] arr, int x) {
        int ceil=-1;
        int floor=-1;
        int[] resArray = new int[2];
        for (int i=0;i<arr.length;i++){
            int diff = x - arr[i];
            if(i==0 && diff<0){
                floor = -1;
                ceil=arr[i];
                break;
            }
             else if(i==arr.length-1 && diff>0){
                ceil= -1;
                floor=arr[i];
                break;
            }
             else{
                 if(diff ==0){
                     floor = arr[i];
                     ceil = arr[i];
                     break;
                 }
                 else if(diff<0){
                     if(x-arr[i-1]>0){
                         floor = arr[i-1];
                         ceil = arr[i];
                         break;
                     }
                 }
            }

        }
        resArray[0]= floor;
        resArray[1]= ceil;

        return resArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x  = 20;
        System.out.println(Arrays.toString(ceilfloor(arr,x)));
    }
}
