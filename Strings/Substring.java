package Strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String --> ");
        String s=sc.next();
        //print all the substrings
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1) + " ");
                }
                System.out.println();
                }
                sc.close();
    
    }
    
}
