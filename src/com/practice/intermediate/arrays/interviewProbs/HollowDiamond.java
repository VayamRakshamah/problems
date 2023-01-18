package com.practice.intermediate.arrays.interviewProbs;

//Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.
//
//See example for clarifications over the pattern for value 4.
//********
//***  ***
//**    **
//*      *
//*      *
//**    **
//***  ***
//********


import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        // Get the value using scanner
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int size = sc.nextInt();
        sc.close();

        for (int row = 0; row < size*2; row++) {
            if(row<size){
                //Print top half
                int col = size*2 - row*2;
                int i = 1;
                //left half of row
                while(i <= col/2) {
                    System.out.print("*");
                    i++;
                }
                //spaces
                while(i <= 2*size - col/2) {
                    System.out.print(" ");
                    i++;
                }
                //right half of row
                while(i <= 2*size) {
                    System.out.print("*");
                    i++;
                }
                System.out.println();
            }
            else if(row>=size){
                //Print bottom half
                int col = (2 * row) - (2 * size) + 2;
                int i = 1;
                //left half of row
                while (i <= col / 2) {
                    System.out.print("*");
                    i++;
                }
                //spaces
                while (i <= 2 * size - col / 2) {
                    System.out.print(" ");
                    i++;
                }
                //right half of row
                while (i <= 2 * size) {
                    System.out.print("*");
                    i++;
                }
                System.out.println();

            }
        }

    }
}
