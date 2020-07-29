package com.company.stack;

import java.util.EmptyStackException;

public class MyStack<T> {

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public void push(T item) {
        StackNode newNode = new StackNode(item);
        top.next = newNode;

        top = newNode;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;

        return item;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
