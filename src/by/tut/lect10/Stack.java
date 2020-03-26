package by.tut.lect10;

import java.util.*;

public class Stack {
    private int stackSize;
    private List<Integer> list;
    private int tailOfStack;
    private List<Integer> stackList;

    public Stack(int stackSize, List<Integer> list) {
        this.stackSize = stackSize;
        this.list = list;
        tailOfStack = -1;
        this.stackList = null;
    }

    public void setStackList(List<Integer> stackList) {
        this.stackList = stackList;
    }

    public void push() {
        List<Integer> stackList = new ArrayList<>();

        System.out.println("Preparing stack filling");
        System.out.println("Stack pointer before adding: " + tailOfStack);
        System.out.println("Stack size: " + list.size());
        System.out.println("Filling stack started");

        for (int i = 0; i < list.size(); i++) {
            if (tailOfStack == (list.size() - 1)) {
                System.out.println("Stack is full");
            } else {
                stackList.add(list.get(++tailOfStack));
                System.out.println("Added number " + stackList.get(tailOfStack));
            }
        }
        System.out.println("Amount of filled numbers: " + stackList.size());
        System.out.println("Stack pointer after adding: " + tailOfStack);
        System.out.println("Filling stack ended sucessfully");
        setStackList(stackList);
    }

    public void pop() {
        System.out.println("Preparing stack Popping out");
        System.out.println("Stack pointer before popping out: " + tailOfStack);
        System.out.println("Stack size: " + list.size());
        System.out.println("Popping out stack started");

        for (int i = 0; i < stackList.size(); i++) {
            if (tailOfStack < 0) {
                System.out.println("Stack is Empty");
            } else {
                System.out.println("Popping out number " + stackList.get(tailOfStack--));
            }
        }
        System.out.println("Popping out stack ended");
    }
}
