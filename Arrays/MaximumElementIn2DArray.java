// Maximum element in the 2D array.
// Given a 2D array of size M*N, find the maximum element in it.
// Here is the code in Java
import java.util.*;
public class MaximumElementIn2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int n = sc.nextInt();
        System.out.println("Size of the 2D array is: "+ m*n);
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the 2D array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println("The maximum element is: "+max);
        sc.close();
        
    }
}