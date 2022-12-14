package com.practice.sorting;


//select min element and bring to front
//TC :- O(n2)
//SC :- O(1)
public class SelectionSort {

    int[] arr = {4,5,1,3,2};

    public void selectionSort(int[] arr) {
        int n  = arr.length;
        for (int i = 0; i < n-1; i++) {
            int smallest= arr[i];
            int idx = i;
            for(int j = i;j<=n-1;j++){
                if(arr[j]<arr[idx]){
                    smallest = arr[j];
                    idx = j;
                }
            }
            swap(arr[i],arr[idx]);
        }
    }

    public static void swap(int num1, int num2){
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
    }
}
