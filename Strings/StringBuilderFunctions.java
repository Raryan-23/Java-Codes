package Strings;

public class StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder tb = new StringBuilder("Hello");
        
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.delete(5, 10);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.charAt(3));
        System.out.println(sb.isEmpty());
        System.out.println(sb.reverse());
    }
}
