package com.company.LinkedList;

import com.company.Stack.Stack;

public class SinglyLinkedListStack<T> implements Stack<T> {
    private SinglyLinkedList<T> singlyLinkedList;

    public SinglyLinkedListStack(){
        singlyLinkedList = new SinglyLinkedList<>();

    }

    @Override
    public void push(T element) {
        singlyLinkedList.addFront(element);
    }

    @Override
    public T pop() {
        return singlyLinkedList.removeHead().getValue();
    }

    @Override
    public int size() {
        return singlyLinkedList.getSize();
    }

    @Override
    public T peek() {
        return singlyLinkedList.getHead().getValue();
    }
}
