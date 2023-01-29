package com.practice.intermediate.arrays.carryForward;

//You are given a string S, and you have to find all the amazing substrings of S.
//
//An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

public class AmazingSubarrays {
    public int solve(String A) {
        char ch;
        int sum=0;
        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<A.length();i++){
            ch = A.charAt(i);
            for(char word:vowel){
                if(ch==word){
                    sum+=(A.length()-1-i+1);
                }
            }
        }

        return sum%10003;
    }
}
