package com.company.LinkedList;

import com.company.Utils.AbstractProblem;
import com.company.Utils.Assert;

import java.util.ArrayList;
import java.util.List;

public class Problem5 extends AbstractProblem {
    SinglyLinkedList<Integer> singlyLinkedList;
    public Problem5() {
        singlyLinkedList = new SinglyLinkedList<>();
    }
    @Override
    public void takeInput() {
        // linked list like 1->2->3->4->5->6
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

        SinglyLinkedNode<Integer> temp1 = singlyLinkedList.getHead();
        SinglyLinkedNode<Integer> temp2 = temp1;
        k--;
        while (k>0 && temp2.getNext()!=null)
        {
            k--;
            temp2=temp2.getNext();
        }
        if (k>0)
        {
            return "Not enough";
        }
        while (temp2.getNext()!=null){
            temp1=temp1.getNext();
            temp2=temp2.getNext();
        }
        return temp1.getValue().toString();
    }
}
