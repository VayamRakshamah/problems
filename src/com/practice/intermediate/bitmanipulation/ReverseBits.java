package com.practice.intermediate.bitmanipulation;

//Reverse the bits of an 32 bit unsigned integer A.

public class ReverseBits {
    public long reverse(long a) {
        long rev = 0;
        int numBits = 0;
        numBits = (int)(Math.log(a)/Math.log(2))+1;
        while(a>0){
            rev <<= 1;
            if((a&1)==1){
                rev^=1;
            }
            a>>=1;
        }
        rev <<= (32-numBits);
        return rev;
    }
}
