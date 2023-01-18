package com.practice.intermediate.modularArithmetic;

//Given a column title as appears in an Excel sheet, return its corresponding column number.

public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int numStr = A.length();
        int num = 0;
        int sum = 0;
        for(int i=numStr-1;i>=0;i--){
            num = (int)(A.charAt(i))-64;
            sum+=(num*Math.pow(26,numStr-i-1));
        }
        return sum;
    }
}
