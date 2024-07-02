/* LeetCode 75. Sort Colors */
/*This is two pass approach of sorting the array containing 0s, 1s and 2s */

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 2, 0, 2, 1, 0};
        int[] arr2= {0,0,0,1,1,1,1,2,2};
        sortColors(arr);
        sortColors(arr2);

        System.out.println("Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
        
        System.out.println("Sorted array is: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
            }

    }

    public static void sortColors(int[] nums) {
        int noOfZeroes=0;
        int noOfOnes=0;
        int n=nums.length;

        for(int i:nums){
            if(i==0){
                noOfZeroes ++;
            }
             if(i==1){
                noOfOnes ++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeroes){
                nums[i]=0;
            }
            else if(i>=noOfZeroes && i< (noOfZeroes + noOfOnes) ){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }

    }
}
