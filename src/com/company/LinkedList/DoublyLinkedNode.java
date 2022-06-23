package com.company.LinkedList;

public class DoublyLinkedNode<T> extends SinglyLinkedNode {
    private DoublyLinkedNode<T> prev;
    public DoublyLinkedNode(T value) {
        super(value);
        prev = null;
    }

    public DoublyLinkedNode<T> getPrev() {
        return prev;
    }
}
