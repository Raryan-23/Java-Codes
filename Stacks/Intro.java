package Stacks;

import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(9);
        st.push(8);
        st.push(7);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.pop());
        st.push(10);
        st.push(32);
        System.out.println(st);
        System.out.println(st.peek());
    }
}
