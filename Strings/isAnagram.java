package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=sc.nextLine();
        System.out.println("Enter second string: ");
        String s2=sc.nextLine();
        if(Anagram(s1,s2))
        System.out.println("Both strings are anagram.");
        else
        System.err.println("Both strings are not anagram.");
        sc.close();
    }

    public static boolean Anagram(String s1, String s2) {
      if (s1.length() != s2.length())  return false;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0; i<c1.length; i++){
            if(c2[i] != c1[i]) return false;
        }
        return true;
    }
}
