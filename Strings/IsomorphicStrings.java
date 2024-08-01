package Strings;
import java.util.Scanner;
public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String: ");
        String s2=sc.nextLine();
        if(isIsomorphic(s1,s2)){
            System.out.println("The strings are isomorphic");
        }
        else{
            System.out.println("The strings are not isomorphic");
        }
        sc.close();
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr = new char[128]; //all ASCII elements are allowed
        for(int i=0;i<s.length();i++){
            char ch1= s.charAt(i);
            char ch2= t.charAt(i);
            int index = (int)ch1;
            if(arr[index] == '\0')  arr[index] = ch2;
            else{
                if(arr[index] != ch2)  return false;
            }
        }
        for(int i=0;i<128;i++){
            arr[i] = '\0';
        }
         for(int i=0;i<t.length();i++){
            char ch1= t.charAt(i);
            char ch2= s.charAt(i);
            int index = (int)ch1;
            if(arr[index] == '\0')  arr[index] = ch2;
            else{
                if(arr[index] != ch2)  return false;
            }
        }
        return true;
    }
}
