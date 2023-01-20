package com.practice.intermediate.modularArithmetic;

//Eight integers A, B, C, D, E, F, G, and H represent two rectangles in a 2D plane.
//For the first rectangle, its bottom left corner is (A, B), and the top right corner is (C, D), and for the second rectangle, its bottom left corner is (E, F), and the top right corner is (G, H).
//
//Find and return whether the two rectangles overlap or not.

public class RectanglesOverlap {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(A==C || B==D || E==G || F==H){
            return 0;
        }
        if(C<=E || B>=H || G<=A || F>=D){
            return 0;
        }
        else{
            return 1;
        }
    }
}
