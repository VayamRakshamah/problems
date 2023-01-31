package com.practice.intermediate.linkedlist;

//You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
//
//Implement the NestedIterator class:
//
//NestedIterator(List nestedList) Initializes the iterator with the nested list nestedList.
//int next() Returns the next integer in the nested list.
//boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
//
//Example 1:
//Input: nestedList = [[1,1],2,[1,1]]
//Output: [1,1,2,1,1]
//Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

import java.util.ArrayList;

public class FlattenNestedListIterator {
    private int pointer = 0;
    private int length = 0;
    private ArrayList<NestedInteger> currList = null;
    private NestedIterator child = null;

    NestedIterator(ArrayList<NestedInteger> nestedList) {
        currList = nestedList;
        length = nestedList.size();
    }

    int next() {
        if(child!=null && child.hasNext()){
            return child.next();
        }
        if(hasNext()){
            NestedInteger nstInt = currList.get(pointer++);
            if(nstInt.isInteger()){
                return nstInt.getInteger();
            }
            child = new NestedIterator(nstInt.getList());
            if(child.hasNext()){
                return child.next();
            }
            return next();
        }
        return -1;
    }

    boolean hasNext() {
        if(child!=null && child.hasNext()){
            return true;
        }
        child = null;
        return pointer < length;
    }
}
