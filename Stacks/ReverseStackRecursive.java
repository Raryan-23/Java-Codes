package Stacks;

import java.util.Stack;

public class ReverseStackRecursive {
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println("Original Stack: " + stack);
    revStack(stack);
    System.out.println("Reversed Stack: " + stack);
    }

    public static void revStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        System.out.println(temp);
        revStack(st);
    }
}
