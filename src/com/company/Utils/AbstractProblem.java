package com.company.Utils;

public abstract class AbstractProblem {
    public abstract void takeInput();
    public abstract void runTests();

    public void run(){
        takeInput();
        runTests();
    }
}
