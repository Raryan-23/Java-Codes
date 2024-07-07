public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,8,5,6,7,4,9,10};
        int n = arr.length+1;
        int sum = (n * (n + 1)) / 2; //Sum of n-Natural Numbers.
        int arrSum = 0;
        for (int i :arr) {
            arrSum += i;
            }
        System.out.println(sum-arrSum);
        
    }
}
