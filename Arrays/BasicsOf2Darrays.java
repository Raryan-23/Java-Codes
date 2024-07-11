import java.util.Scanner;

public class BasicsOf2Darrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] grid = new int[2][4];
        // Taking Input
        int m= grid.length; //No of Rows
        int n = grid[0].length; // No of Columns
        System.out.println("This is a 2D array having " + m*n + " elements.");
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                }
                }
        // Printing Output
        System.out.println("The 2D array is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
                }
                System.out.println();
                }
    sc.close();

    }
}
