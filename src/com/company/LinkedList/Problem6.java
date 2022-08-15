package com.company.LinkedList;

import com.company.Utils.AbstractProblem;
import com.company.Utils.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problem6 extends AbstractProblem {
    List<SinglyLinkedList> listOfLists;
    public Problem6() {
        listOfLists = new ArrayList<>();
    }
    @Override
    public void takeInput() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        //linked list like 1->2->3->4->5->6
        //                       A--------V
        for(int i=6;i>=1;i--)
            singlyLinkedList.addFront(i);
        SinglyLinkedNode<Integer> node = singlyLinkedList.getHead().getNext().getNext();
        SinglyLinkedNode<Integer> tail = node;
        while (tail.getNext()!= null)
            tail = tail.getNext();
        tail.setNext(node);
        // linked list like 1->2->3->4->5->6
        SinglyLinkedList<Integer> singlyLinkedList1 = new SinglyLinkedList<>();
        for(int i=6;i>=1;i--)
            singlyLinkedList1.addFront(i);
        listOfLists.add(singlyLinkedList);
        listOfLists.add(singlyLinkedList1);
    }

    @Override
    public void runTests() {
        Assert.equals("Contains cycle", true, solve(listOfLists.get(0)));
        Assert.equals("Doesnt contain cycle", false, solve(listOfLists.get(1)));
    }

    private boolean solve(SinglyLinkedList<Integer> singlyLinkedList) {
        SinglyLinkedNode<Integer> head = singlyLinkedList.getHead();
        HashSet<SinglyLinkedNode> hashSet = new HashSet<>();
        while (head != null) {
            if(hashSet.contains(head))
                return true;
            hashSet.add(head);
            head = head.getNext();
        }
        return false;
    }
}
