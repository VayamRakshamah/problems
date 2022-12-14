package com.practice.sorting.sortingProblems;

//A step array is an array of integers where each element has a difference of at most k with its neighbor.
// Given a key x, we need to find the index value of x if multiple-element exist to return the first occurrence of the key.
public class StepArraySearch {

    private static int stepUp(int[] arr, int k, int x) {
        int i=0;
        int idx = -1;


        if(arr[0]+(k*(arr.length-1)) < x){
            return -1;
        }
        else{
            while(i<arr.length){
                if(arr[i]==x){
                    return i;
                }
                else if(Math.abs(x-arr[i]) < k){
                    i++;
                }
                else if(Math.abs(x-arr[i]) >= k){
                    int diff_step = Math.abs(arr[i]-x)/k;
                    i = i+diff_step;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 70, 70, 60};
        int k =20;
        int x = 60;
        int arr1[] = {4, 5, 6, 7, 6};
        int k1 = 1;
        int x1 = 6;
        System.out.println(stepUp(arr,k,x));
    }

}
