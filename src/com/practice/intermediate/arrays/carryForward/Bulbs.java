package com.practice.intermediate.arrays.carryForward;

//A wire connects N light bulbs.
//
//Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
//
//Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
//
//You can press the same switch multiple times.
//
//Note: 0 represents the bulb is off and 1 represents the bulb is on.

import java.util.ArrayList;

public class Bulbs {
    public int bulbs(ArrayList<Integer> A) {
        int result =0 ;
        int count =0;
        for(int i=0;i<A.size();i++){
            if((A.get(i)==0 && count%2==0) || (A.get(i)==1 && count%2!=0)){
                result++;
                count++;
            }
        }
        return result;
    }
}
