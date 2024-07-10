public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
            }
            return result;
            }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,3,4,4,5,5,6,6};
        int ans = singleNumber(nums);

        System.out.println(ans);
    }
    
}
