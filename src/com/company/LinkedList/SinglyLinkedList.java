package com.company.LinkedList;

public class SinglyLinkedList<T> {
    private SinglyLinkedNode<T> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        size = 0;
    }

    public void addFront(T value){
        SinglyLinkedNode<T> node =  new SinglyLinkedNode<>(value);

        if (head != null) {
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public SinglyLinkedNode<T> removeHead(){
        SinglyLinkedNode<T> node = head;

        if(head != null) {
            head = head.getNext();
            size = size-1;
        }
        return node;
    }

    public int getSize() {
        return size;
    }

    public SinglyLinkedNode<T> getHead() {
        return head;
    }
}
