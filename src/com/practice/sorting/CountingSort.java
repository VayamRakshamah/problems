package com.practice.sorting;

import java.util.Arrays;
import java.util.Collections;

//Count and maintain the frequency of each element
public class CountingSort {
    int[] arr = {5,3,8,2,6,8,10};
    public int maxNum(int[] arr){
        int max=arr[0];
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public void countSort(int[] arr){
        int[] freq = new int[maxNum(arr)+1];
        //build freq array
        for(int x:arr){
            freq[x] +=1;
        }
        //iterate over array
        for(int i=0; i<freq.length; i++){
            while(freq[i]>0){
                System.out.println(i);
                freq[i]--;
            }
        }
    }
}
