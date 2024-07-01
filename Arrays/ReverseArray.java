/* This file contains the code for reversing the array in-place. */

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Array before reverse: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
        int n=arr.length;
        System.out.println("\nArray after reverse: ");
        int i=0,j=n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
    }  
        for(int k:arr){
            System.out.print(k+" ");
        }

}

    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}