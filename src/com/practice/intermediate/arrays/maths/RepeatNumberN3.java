package com.practice.intermediate.arrays.maths;

//You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
//If so, return the integer. If not, return -1.
//
//If there are multiple solutions, return any one.

import java.util.List;

public class RepeatNumberN3 {
    public int repeatedNumber(final List<Integer> a) {
        int num1=Integer.MIN_VALUE;
        int num2=Integer.MAX_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<a.size();i++){
            if(num1==a.get(i)){
                count1++;
            }
            else if(num2==a.get(i)){
                count2++;
            }
            else if(count1==0){
                num1=a.get(i);
                count1++;
            }
            else if(count2==0){
                num2=a.get(i);
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for(int i=0;i<a.size();i++){
            if(a.get(i)==num1){
                count1++;
            }
            else if(a.get(i)==num2){
                count2++;
            }
        }

        if(count1>(a.size()/3)){
            return num1;
        }
        else if(count2>(a.size()/3)){
            return num2;
        }
        else{
            return -1;
        }
    }
}
