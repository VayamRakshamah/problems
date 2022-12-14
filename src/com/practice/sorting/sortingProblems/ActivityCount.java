package com.practice.sorting.sortingProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Activity{
    int start;
    int end;

    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //method that returns key for sorting , in this case it is endTime

    int getEnd() {
        return end;
    }
}

//max activities that can be done together
public class ActivityCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //create an array of objects
        Activity list[] = new Activity[n];

        //read the objects in activity object list
        for(int i = 0; i < n; i++){
            int s,e;
            s = sc.nextInt();
            e = sc.nextInt();
            list[i] = new Activity(s,e);
        }

        //Algorithm
        Arrays.sort(list, Comparator.comparing(Activity::getEnd));

        int count = 1;
        int endTime = list[0].end;
        for(int i = 1; i < n; i++){
            if(list[i].start>=endTime){
                count++;
                endTime = list[i].end;
            }
        }

        //Count of activities that can be performed
        System.out.println(count);

    }
}
