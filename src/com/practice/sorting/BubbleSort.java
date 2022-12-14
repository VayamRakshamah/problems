package com.practice.sorting;

//Iterate over next element and check if bigger
//TC :- O(n2)
//SC :- O(1)
public class BubbleSort {

    int[] arr = {4,5,3,1,2};

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
    }

    public static void swap(int num1, int num2){
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
    }
}
