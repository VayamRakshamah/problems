package com.practice.intermediate.modularArithmetic;

//Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.
//
//Return the minimum result obtained.

public class ConcatThreeNum {
    public int solve(int A, int B, int C) {

        StringBuilder sb = new StringBuilder();
        int res  = 0;

        if(A<=B && A<=C){
            sb.append(A);
            if(B<=C){
                sb.append(B);
                sb.append(C);
            }
            else{
                sb.append(C);
                sb.append(B);
            }
        }
        else if(B<=A && B<=C){
            sb.append(B);
            if(A<=C){
                sb.append(A);
                sb.append(C);
            }
            else{
                sb.append(C);
                sb.append(A);
            }
        }
        else{
            sb.append(C);
            if(A<=B){
                sb.append(A);
                sb.append(B);
            }
            else{
                sb.append(B);
                sb.append(A);
            }
        }

        res = Integer.parseInt(sb.toString());
        return res;

    }
}
