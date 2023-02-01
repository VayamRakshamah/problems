package com.practice.intermediate.hashing;

//Given a number A, find if it is COLORFUL number or not.
//
//If number A is a COLORFUL number return 1 else, return 0.
//
//What is a COLORFUL Number:
//
//A number can be broken into different contiguous sub-subsequence parts.
//Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
//And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.

import java.util.HashSet;

public class ColorfulNumber {
    public static int colorful(int A) {
        HashSet<Integer> hm = new HashSet<Integer>();
        String str = String.valueOf(A);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= str.length()-i; j++){
                String sub = str.substring(i,i+j);
                int prod = 1;
                for (int k = 0; k < sub.length(); k++) {
                    int digit = Integer.parseInt(Character.toString(sub.charAt(k)));
                    prod = prod * digit;
                }
                if(hm.contains(prod)){
                    return 0;
                }
                else{
                    hm.add(prod);
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(colorful(2634));
    }
}
