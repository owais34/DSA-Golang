package com.company.LinkedList;

import com.company.Utils.AbstractProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem6 extends AbstractProblem {
    List<SinglyLinkedList> listOfLists;
    Problem6() {
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

    }
}
