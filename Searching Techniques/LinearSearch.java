import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element to be searched: ");
            int x = sc.nextInt();

            boolean flag= false;
            for(int i=0;i<n;i++){
                if(arr[i] == x){
                    flag=true;
                    break;

                }
            }
            if(flag) System.out.println("Element Found");
            else System.out.println("Not Found");
            sc.close();
    }
}
