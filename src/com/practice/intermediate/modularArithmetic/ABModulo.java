package com.practice.intermediate.modularArithmetic;

//Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.

public class ABModulo {
    public int solve(int A, int B) {
        if(A>B){
            return A-B;
        }
        else{
            return B-A;
        }
    }
}
