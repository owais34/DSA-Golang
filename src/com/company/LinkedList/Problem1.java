package com.company.LinkedList;

import com.company.Stack.Stack;

import java.sql.SQLOutput;

/**
 * Implement stack using linked List
 */
public class Problem1 {
    Stack<Integer> stack;
    public Problem1() {
        stack = new SinglyLinkedListStack<>();
    }
    public void runTests() {
        testPush();
        testPop();
        testSize();
    }
    public void testPush(){
        stack.push(32);
        if(stack.peek() != 32)
            System.out.println("Test Failed at push");
        else
            System.out.println("Passed");
    }
    public void testPop(){
        Integer num = stack.pop();
        if(num != 32)
            System.out.println("Test Failed at pop");
        else
            System.out.println("Passed");
    }
    public void testSize() {
        if(stack.size()!=0)
            System.out.println("Test Failed at size");
        else
            System.out.println("Passed");
    }
}
