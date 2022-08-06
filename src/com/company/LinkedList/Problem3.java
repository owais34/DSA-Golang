package com.company.LinkedList;

import com.company.Utils.AbstractProblem;
import com.company.Utils.Assert;

import java.util.TreeMap;


public class Problem3 extends AbstractProblem {
    SinglyLinkedList<Integer> singlyLinkedList;
    public Problem3(){
        singlyLinkedList = new SinglyLinkedList<>();
    }
    @Override
    public void takeInput() {
        //linked list like 1->2->3->4->5->6->null
        for(int i=6;i>=1;i--)
            singlyLinkedList.addFront(i);

    }

    @Override
    public void runTests() {
        Assert.equals("Test 1st from last", "6",solve(1,singlyLinkedList));
        Assert.equals("Test 2nd from last","5",solve(2, singlyLinkedList));
        Assert.equals("Test 7th from last","Not enough",solve(7,singlyLinkedList));
        Assert.equals("Test Sixth from last","1",solve(6,singlyLinkedList));
    }

    public String solve(int k, SinglyLinkedList<Integer> singlyLinkedList) {
        TreeMap<Integer,SinglyLinkedNode> treeMap = new TreeMap<>();
        int i = 1;
        SinglyLinkedNode iterator = singlyLinkedList.getHead();
        while (iterator!=null) {
            treeMap.put(i, iterator);
            i++;
            iterator=iterator.getNext();
        }

        return treeMap.get(i-k) == null ? "Not enough": treeMap.get(i-k).getValue().toString();
    }
}
