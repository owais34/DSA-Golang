package com.company.LinkedList;

public class SinglyLinkedNode<T> {
    private T value;
    private SinglyLinkedNode<T> next;
    public SinglyLinkedNode(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public SinglyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(SinglyLinkedNode<T> next) {
        this.next = next;
    }
}
