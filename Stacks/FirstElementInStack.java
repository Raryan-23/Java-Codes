package Stacks;

import java.util.Stack;

public class FirstElementInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("First element in stack is: " + st.firstElement());
        System.out.println(st.search(0));
        // This searches from top to bottom and number accordingly.
    }
}
