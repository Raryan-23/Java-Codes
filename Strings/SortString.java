package Strings;
import java.util.*;
public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");   
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (char c : charArray) {
            System.out.print(c);
        }
        sc.close();
    }
}
