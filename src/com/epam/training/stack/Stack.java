package com.epam.training.stack;

import java.util.EmptyStackException;

public class Stack<T> {

    private Object[] stackArray;
    private int head;
    private int capacity;

    private static final int INITIAL_CAPACITY = 16;

    public Stack() {
        head = -1;
        capacity = INITIAL_CAPACITY;
        stackArray = new Object[capacity];
    }

    public boolean empty() {

        return head == -1;
    }

    public void push(final T item) {

        if (head == capacity - 1) {
            final Object[] tempStack = new Object[capacity * 2];
            System.arraycopy(stackArray, 0, tempStack, 0, capacity);
            capacity *= 2;
            stackArray = tempStack;
        }

        head++;
        stackArray[head] = item;
    }

    public T pop() {

        if (head == -1) {
            throw new EmptyStackException();
        }

        if (head < capacity / 4) {
            final Object[] tempStack = new Object[capacity / 2];
            System.arraycopy(stackArray, 0, tempStack, 0, head);
            capacity /= 2;
            stackArray = tempStack;
        }

        head--;

        return (T) stackArray[head + 1];
    }

    public T peek() {

        if (head == -1) {
            throw new EmptyStackException();
        }

        return (T) stackArray[head];
    }
}
