/* This code contains two functions which will help you to calculate
 the maximum and the minimum element in the Java */



import java.util.Scanner;

class MaxMinInArray{

    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min, arr[i]);
            }
            return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        int maxElement= findMax(arr);
        int minElement= findMin(arr);

        System.out.println("The maximum value in the array is "+ maxElement);
        System.out.println("The maximum value in the array is "+ minElement);
        sc.close();
    }
}