package com.practice.intermediate.arrays.maths;

//Given an integer A, find and return the Ath magic number.
//
//A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
//
//First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5),

public class NthMagicNumber {
    public static int solve(int A) {
        int pow = 1;
        int answer = 0;
        while (A != 0)
        {
            pow = pow*5;
            if ((int)(A & 1) == 1)
                answer += pow;
            A >>= 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
