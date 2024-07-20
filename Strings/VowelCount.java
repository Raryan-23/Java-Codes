package Strings;
//Write code to count number of vowels in a user given string
import java.util.Scanner;
public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
            || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E'
            || str.charAt(i) == 'I' || str.charAt(i) == 'O'
            || str.charAt(i) == 'U') {
                count++;
                }
                }
                System.out.println("Number of vowels in the string: " + count);
                sc.close();
                }
                
                }


