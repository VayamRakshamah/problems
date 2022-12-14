package com.practice.mediumArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

    private static int major(int[] arr) {
        int ans =-1;

        HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
        for(int i = 0; i < arr.length; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        //

        Iterator<Map.Entry<Integer, Integer>> itr = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, Integer> entry = itr.next();
            if(entry.getValue()>arr.length/2){
                ans = entry.getKey();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(major(arr));
    }
}
