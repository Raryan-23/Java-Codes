/* Sorting the array containg 0s and 1s. */
/*This is a two pass approach! */

public class SortZeroesOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1};
        int n=arr.length;

        System.out.print("Your input array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            }
        int noOfZeros=0;
        for(int i:arr){
            if(i==0){
                noOfZeros++;
            }
        }

        for(int i=0;i<n;i++){
            if(i<noOfZeros){
                arr[i]=0;
        }
        else{
            arr[i]=1;
        }
    }
    System.out.println();
    System.out.print("Your sorted array is: ");
    for(int i:arr){
        System.out.print(i+" ");
        }
    }
}
