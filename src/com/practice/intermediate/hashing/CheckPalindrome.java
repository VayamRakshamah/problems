package com.practice.intermediate.hashing;

//Given a string A consisting of lowercase characters.
//
//Check if characters of the given string can be rearranged to form a palindrome.
//
//Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.

import java.util.HashMap;
import java.util.Map;

public  class CheckPalindrome {
    public int solve(String A) {
        int len = A.length();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
            if(hm.containsKey(A.charAt(i))){
                hm.put(A.charAt(i),hm.get(A.charAt(i))+1);
            }
            else{
                hm.put(A.charAt(i),1);
            }
        }
        int charCountEven = 0;
        int charCountOdd = 0;
        int charCount = hm.size();
        for(Map.Entry<Character,Integer> check : hm.entrySet()){
            if(check.getValue()%2==0){
                charCountEven++;
            }
            else{
                charCountOdd++;
            }
        }
        if(charCountEven+charCountOdd==charCount){
            if(charCountOdd<=1){
                return 1;
            }
            else{
                return 0;
            }
        }
        return 0;
    }
}
