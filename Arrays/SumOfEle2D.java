import java.util.Scanner;

public class SumOfEle2D {
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
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of elements is: "+sum);
        sc.close();
        
    }
    
}
