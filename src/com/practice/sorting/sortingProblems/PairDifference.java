package com.practice.sorting.sortingProblems;

import java.util.Arrays;
import java.util.HashMap;

public class PairDifference {

    private static int[] pairDifferece(int[] arr, int x) {
        int[] resArray = {-1,-1};
        int diff1 = Integer.MIN_VALUE;
        int diff2 = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        for(int j =0;j<arr.length;j++){
            diff1 = x-arr[j];
            diff2 = arr[j]-x;
            if(hmap.containsKey(diff1)){
                if(hmap.get(diff1)==1){
                    resArray[0] = arr[j];
                    resArray[1] = diff1;
                    break;
                }
                else{
                    resArray[0] = arr[j];
                    resArray[1] = arr[j];
                    break;
                }

            }
            if(hmap.containsKey(diff2)){
                if(hmap.get(diff2)==1){
                    resArray[0] = arr[j];
                    resArray[1] = diff2;
                    break;
                }
                else{
                    resArray[0] = arr[j];
                    resArray[1] = arr[j];
                    break;
                }

            }

        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 50, 80};
        int x = 78;
        System.out.println(Arrays.toString(pairDifferece(arr,x)));
    }
}
