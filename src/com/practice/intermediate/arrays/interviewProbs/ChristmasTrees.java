package com.practice.intermediate.arrays.interviewProbs;

//You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost
// of each of the trees (Bi is the cost of tree Ai, where 1 ≤ row ≤ size(A)),
// and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
//The cost of these trees is Bp + Bq + Br.
//
//You are to choose 3 trees such that their total cost is minimum. Return that cost.
//
//If it is not possible to choose 3 such trees return -1.

public class ChristmasTrees {
    public int solve(int[] A, int[] B) {
        int sum = Integer.MAX_VALUE;
        int num1 = -1;
        int num2 = -1;
        int num3 = -1;

        for(int i=0; i<A.length-2;i++){
            if(B[i]<sum){
                for(int j=i+1;j<A.length-1;j++){
                    if(A[i]<A[j] && B[i]+B[j]<sum){
                        for(int k=j+1;k<A.length;k++){
                            if(A[j]<A[k]){
                                num1 = i;
                                num2 = j;
                                num3 = k;
                                sum = Math.min(sum,(B[num1]+B[num2]+B[num3]));
                            }
                        }
                    }
                }
            }

        }
        if(num1==-1){
            return -1;
        }
        else{
            return sum;
        }
    }
}
