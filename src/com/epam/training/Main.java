package com.epam.training;

import com.epam.training.stack.Stack;

public class Main {

    public static void main(final String[] args) {
        final Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 17; i++) {
            stack.push(i);
        }

        /*for (int i = 0; i < 17; i++) {
            stack.pop();
        }*/

        if(!stack.empty()) {
            System.out.println("Stack is not empty");
            System.out.println(stack.peek());
            System.out.println(stack.pop());
        }

        System.out.println(stack.peek());
    }
}
