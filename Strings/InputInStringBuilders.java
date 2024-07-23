package Strings;
import java.util.*;
public class InputInStringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Method 01:
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);

        // Method 02:
        System.out.print("Enter your String: ");
        StringBuilder tb = new StringBuilder(sc.nextLine());
        System.out.println(tb);
        sc.close();
    }
}
