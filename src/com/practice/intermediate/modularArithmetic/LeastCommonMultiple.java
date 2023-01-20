package com.practice.intermediate.modularArithmetic;

//Write a program to input an integer T and then for each test case input two integers A and B in two different lines
// and then print T lines containing Least Common Multiple (LCM) of two given 2 numbers A and B.
//
//LCM of two integers is the smallest positive integer divisible by both.

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int queryNum = sc.nextInt();
        int[] allInts = new int[2 * queryNum];
        for (int i = 0; i < 2 * queryNum; i++) {
            allInts[i] = sc.nextInt();
        }
        for (int i = 0; i < allInts.length; i = i + 2) {
            System.out.println(lcm(allInts[i], allInts[i + 1]));
        }
    }
    public static int lcm(int A, int B){
        int ans = (A>B)?A:B;
        int i=1;
        while(true){
            if((ans*i)%A==0  && (ans*i)%B==0){
                ans*=i;
                break;
            }
            ++i;
        }

        return ans;
    }
}
