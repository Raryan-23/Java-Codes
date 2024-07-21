package Strings;

public class BasicOfString {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "I am Raj, This side.";

        //printing a string directly.
        System.out.println(s1);
        System.out.print(s2);
        System.out.println();
        char[] str ={'r','a','j',' ','a','r','y','a','n'};

        //using char array loop
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
            }

        // calling as String is an Object in Java.
        String s3 = new String(str);
        System.out.println();
        System.out.print(s3);
        
    }
}
