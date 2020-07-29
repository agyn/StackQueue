package com.company.queue;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    public static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    public QueueNode<T> first;
    public QueueNode<T> last;

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public void add(T item) {
        QueueNode newNode = new QueueNode(item);

        if (last != null) {
            last.next = newNode;
        }
        last = newNode;

        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();

        T data = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
