import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        // ArrayList is a dynamic array
        // ArrayList is a part of collection framework
        // ArrayList is a class in java.util package
        // ArrayList is a resizable array
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        System.out.println(arr.get(3));
        System.out.println(arr.size());
        arr.remove(3);
        System.out.println(arr);
        arr.set(1,999);
        System.out.println(arr);
    }
}
