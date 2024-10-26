package Stacks;

import java.util.Stack;

public class copyStack {
    public static Stack<Integer> copyStacks(Stack<Integer> originalStack) {
        Stack<Integer> copiedStack = new Stack<>();

        // Copy elements from original stack to copied stack
        for (Integer element : originalStack) {
            copiedStack.push(element);
        }

        return copiedStack;
    }
public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(1);
        originalStack.push(22);
        originalStack.push(98);
        originalStack.push(14);
        originalStack.push(587);

        System.out.println("Original Stack: " + originalStack);

        Stack<Integer> copiedStack = copyStacks(originalStack);

        System.out.println("Copied Stack: " + copiedStack);
    }
}
