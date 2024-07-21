package Strings;

import java.util.Scanner;

public class UpdateEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String s1 = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                //s = s.replace(s.charAt(i), '*');
                s1 += '*';
                }
            else{
                s1 += s.charAt(i);
            }
        }
        System.out.println(s1);
        sc.close();
    }
}

