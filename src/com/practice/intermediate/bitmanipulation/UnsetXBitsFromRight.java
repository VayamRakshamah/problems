package com.practice.intermediate.bitmanipulation;

//Given an integer A. Unset B bits from the right of A in binary.
//For eg:-
//A = 93, B = 4
//A in binary = 1011101
//A should become = 1010000 = 80. Therefore return 80.

public class UnsetXBitsFromRight {
    public long solve(long A, int B) {
        for(int i=0;i<B;i++){
            A = A&(~(1<<i));
        }
        return A;
    }
}
