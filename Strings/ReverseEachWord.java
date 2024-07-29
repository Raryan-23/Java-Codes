package Strings;
import java.util.Scanner;
public class ReverseEachWord {

    public static void reverse(StringBuilder s, int i, int j){
        while(i<=j){
            char temp = s.charAt(i);
            s.setCharAt(i , s.charAt(j));
            s.setCharAt(j, temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n=sb.length();
        int i=0,j=0;
        while (j<n) {
            if(sb.charAt(j) != ' ') j++;
            else {
                reverse(sb, i, j-1);
                i = j+1;
                j=i;
            }
        }
        reverse(sb, i, j-1);
        System.out.println(sb);
        sc.close();
    }
    
}
