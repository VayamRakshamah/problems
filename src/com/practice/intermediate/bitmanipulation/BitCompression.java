package com.practice.intermediate.bitmanipulation;

//Richard Hendricks, a mastermind in compression algorithms, is an employee of Hooli in Silicon Valley.
//One day, he finally decided to quit and work on his new idea of the middle-out compression algorithm.
//
//He needed to work at the bit - level to compress data. He, eventually, encountered this problem.
//There is an array A of N integers. He has to perform certain operations on the elements.
//In any one operation, two indices i and j (i < j) are chosen, and A[i] is replaced with A[i] & A[j],
//and A[j] is replaced with A[i] | A[j], where & represents the Bitwise AND operation and | represents the Bitwise OR operation.
//This operation is performed over all the pairs of integers in the array.
//
//Help Richard find the Bitwise XOR of all the elements after performing the operations.

public class BitCompression {

    public int compressBits(int[] A) {
        int a = 0;
        int b = 0;
        for(int i=0;i<A.length-1;i++){
            a = A[i];
            b = A[i+1];
            A[i] = a&b;
            A[i+1] = a|b;
        }
        int res = A[0];
        for(int i=1;i<A.length;i++){
            res = res^A[i];
        }
        return res;
    }

}
