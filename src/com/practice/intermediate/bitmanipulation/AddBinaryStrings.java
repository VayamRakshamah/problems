package com.practice.intermediate.bitmanipulation;

//Given two binary strings A and B. Return their sum (also a binary string).
// eg. A = "100"
//B = "11"
//A+B = "111"

public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        StringBuilder res = new StringBuilder("");
        int sum = 0;
        int Alen = A.length();
        int Blen = B.length();
        int i = Alen - 1;
        int j = Blen - 1;
        while(i>=0||j>=0||sum==1){
            sum+=((i>=0)?A.charAt(i) - '0':0);
            sum+=((j>=0)?B.charAt(j) - '0':0);

            res.append((char)(sum % 2+'0'));

            sum/=2;
            i--;
            j--;

        }
        int start = res.length()-1;
        while(start>=0 && res.charAt(start) == '0'){
            start--;
        }
        if(start!=res.length()-1){
            res.delete(start+1,res.length());
        }

        return res.reverse().toString();

    }
}
