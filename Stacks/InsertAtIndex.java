package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtIndex {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("My current Stack: " + s);
        System.out.println("Enter the index: ");
        int idx = sc.nextInt();
        System.out.println("Enter the element to insert at End: ");
        int new_element = sc.nextInt();
        while (s.size() > idx) {
            s2.push(s.pop());
        }
        s.push(new_element);
        while (!s2.isEmpty()) {
            s.push(s2.pop());
        }
        System.out.println("My current Stack: " + s);
        sc.close();
    }
}
