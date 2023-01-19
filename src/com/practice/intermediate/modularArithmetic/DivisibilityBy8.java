package com.practice.intermediate.modularArithmetic;

//You are given a number A in the form of a string. Check if the number is divisible by eight or not.
//
//Return 1 if it is divisible by eight else, return 0.

public class DivisibilityBy8 {
    public  static int solve(String A) {
        int len  = A.length();
        String sub = A.substring(len-3);
        int num = Integer.parseInt(sub);
        if(num%8 == 0 ){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        String str = "11808";
        int res = solve(str);
        System.out.println(res);
    }
}
