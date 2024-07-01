/* LeetCode 1. Two Sum */


public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,22,6,10,5};
        int target = 12;
        int  n = nums.length;
        for(int i=0;i<n;i++){
            boolean flag=false; //for optimization of the code
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+" "+nums[j]);
                    break; //for optimization of the code
                }
                
            }
            if(flag==true) break; //for optimization of the code
        }
    }
}

