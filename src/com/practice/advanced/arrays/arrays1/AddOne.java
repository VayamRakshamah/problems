package com.practice.advanced.arrays.arrays1;

//Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
//
//The digits are stored such that the most significant digit is at the head of the list.
//
//NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
//
//Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
//A: For the purpose of this question, YES
//Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
//A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

import java.util.ArrayList;

public class AddOne {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        while(A.get(0)==0 && A.size()>1){
            A.remove(0);
        }
        int size = A.size();
        for (int i = size-1; i>= 0; i--){
            int num = A.get(i)+1;
            if(num<=9){
                A.set(i,num);
                break;
            }
            else{
                A.set(i,0);
                if(i==0){
                    A.add(0,1);
                }
            }
        }
        return A;
    }
}
