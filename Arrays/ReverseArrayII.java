/* This code refers to reverse an array from specific indexes */


import java.util.*;
public class ReverseArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user array input.
        System.out.print("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        
        System.out.println("Array before reverse: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }

        System.out.println();
        System.out.print("Enter the index from where you need to reverse: ");
        int i=sc.nextInt();
        System.out.print("Enter the index till where you need to reverse: ");
        int j=sc.nextInt();

        System.out.println("\nArray after reverse: ");
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
    }  
        for(int k:arr){
            System.out.print(k+" ");
        }
        sc.close();
}

    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}