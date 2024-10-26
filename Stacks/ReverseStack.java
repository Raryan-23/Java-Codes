package Stacks;

import java.util.Stack;

public class ReverseStack {
public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stack_rev = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println("Original Stack: " + stack);
    while (!stack.isEmpty()) {
        System.out.println(stack.peek());
        stack_rev.push(stack.pop());
        System.out.println("Stack after popping: " + stack);
    }
    System.out.println("Reversed Stack: " + stack_rev);
    }
    
}