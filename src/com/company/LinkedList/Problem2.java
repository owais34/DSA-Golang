package com.company.LinkedList;

import com.company.Utils.AbstractProblem;
import com.company.Utils.Assert;

/**
 * Find nth from End of LinkedList
 */
public class Problem2 extends AbstractProblem {
    SinglyLinkedList<Integer> singlyLinkedList;
    public Problem2() {
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

    public String solve(int n,SinglyLinkedList<Integer> singlyLinkedList){

        SinglyLinkedNode<Integer> leftPointer = singlyLinkedList.getHead();
        SinglyLinkedNode<Integer> pointer = leftPointer;
        int count = n;
        while (count>0 && leftPointer!=null){
            leftPointer=leftPointer.getNext();
            count--;
        }
        if(count > 0)
            return "Not enough";
        while (leftPointer!=null){
            leftPointer = leftPointer.getNext();
            pointer = pointer.getNext();
        }
        return pointer.getValue().toString();
    }
}
