package Strings;
import java.util.Scanner;
public class toggleChars {
    public static String ToggleTheCharacter(String str){ 
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for(int i = 0; i < n; i++){
            char ch = sb.charAt(i);
            int Ascii_value = (int)ch;
            if(Ascii_value >= 65 && Ascii_value <= 90){ //CAPTITAL LETTERS
                Ascii_value += 32;
            }
            else if(Ascii_value >= 97 && Ascii_value <= 122){ //SMALL
                Ascii_value -= 32;
            }
            ch = (char)Ascii_value;
            sb.setCharAt(i, ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String ans= ToggleTheCharacter(str);
        System.out.println(ans);
        sc.close();
    }
}
