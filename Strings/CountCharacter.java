package Strings;
import java .util.Scanner;
public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int [] freq= new int[26];
        //0 -> a || 1 -> b || 2 -> c || .......... || 25 -> z
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        int maxFreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        for(int i=0;i<freq.length;i++){ 
            if(freq[i] == maxFreq){
                char ch = (char)(i+ 97);
                System.out.println("Character: "+ch+" || Frequency: "+maxFreq);
            }
        }           
    sc.close();
    }
}
