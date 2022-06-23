package com.company.Stack;

public interface Stack<T>{
    public void push(T element);
    public T pop();
    public int size();
    public T peek();
}
