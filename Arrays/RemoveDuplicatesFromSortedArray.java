public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,3,3,6,6,6,9,9,9,10};
        int ans=removeDuplicates(nums);
        System.out.println();
        System.out.println("Number of Elements: "+ans);
        
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                }
                }
                for(int k=0;k<i+1;k++){
                    System.out.print(nums[k] + " ");
                }
                return (i+1);
                
                }
    }
