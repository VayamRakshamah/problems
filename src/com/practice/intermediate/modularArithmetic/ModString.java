package com.practice.intermediate.modularArithmetic;

//You are given a large number in the form of a string A where each character denotes a digit of the number.
//You are also given a number B. You have to find out the value of A % B and return it.

public class ModString {
    public static int findMod(String A, int B) {
        long res = 0;
        for (int i = 0; i < A.length();i++){
            res  = (res*10 + (long)Integer.parseInt(A.charAt(i)+""))%B;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        String num = "12316767678678";
        System.out.println(findMod(num, 10));
    }
}
