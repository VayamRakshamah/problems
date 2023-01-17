package com.practice.intermediate.arrays.interviewProbs;

//Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
// Find and return the length of the longest consecutive 1’s that can be achieved.

public class LengthOfLongestConsecutiveOnes {
    public static int solve(String A) {
        int len = A.length();
        int ans = 0;
        int num1 = 0;
        for(int i = 0; i < len; i++){
            if(A.charAt(i) == '1'){
                num1++;
            }
        }
        if(num1 == len){
            return len;
        }
        for (int i = 0; i < len; i++) {
            if (A.charAt(i) == '0') {
                int left = 0;
                for(int j=i-1;j>=0;j--){
                    if(A.charAt(j)=='1'){
                        left++;
                    }
                    else{
                        break;
                    }
                }

                int right = 0;
                for(int k =i+1;k<len;k++){
                    if(A.charAt(k)== '1'){
                        right++;
                    }
                    else{
                        break;
                    }
                }
                if(num1 > left+right) {
                    ans = Math.max(ans,left+right+1);
                } else {
                    ans = Math.max(ans,left+right);
                }
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        String A = "00000011111111";
        int soln = solve(A);
        System.out.println(soln);
    }
}
