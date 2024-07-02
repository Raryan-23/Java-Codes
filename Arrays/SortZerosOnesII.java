// One Pass Solution
// Two-Pointer Approach
/* Sorting the array containg 0s and 1s. */


public class SortZerosOnesII {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else{
                arr[i]=0;
                arr[j]=1;
            }
        }

        System.out.println("Array is: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
            }

    }
}
