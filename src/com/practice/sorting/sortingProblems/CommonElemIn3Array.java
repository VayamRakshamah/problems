package com.practice.sorting.sortingProblems;
//Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

import java.util.Arrays;

public class CommonElemIn3Array {

    public static int[] common(int[] ar1, int[] ar2, int[] ar3) {
        int size1 = ar1.length;
        int size2 = ar2.length;
        int size3 = ar3.length;
        int resSize = Math.min(Math.min(size1, size2),size3);
        int[] resArray = new int[resSize];
        int i=0;
        int j=0;
        int k = 0;
        int l = 0;

        while(i<=size1-1 && j<=size2-1 && k<=size3-1){

            if(ar1[i]==ar2[j]){

                if(ar3[k]==ar2[j]){
                    resArray[l] = ar3[k];
                    i++;
                    j++;
                    k++;
                    l++;
                }
                else if(ar3[k]<ar2[j]){
                    k++;
                }
            }
             else if(ar1[i]<ar2[j]){
                i++;
            }
            else if(ar2[j]<ar1[i]){
                j++;
            }
        }

        return resArray;

    }

    public static void main(String[] args) {

        int  ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(Arrays.toString(common(ar1, ar2, ar3)));

    }

}
