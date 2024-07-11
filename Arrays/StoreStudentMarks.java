import java.util.Scanner;

public class StoreStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int [6][2];

        System.out.println("Enter the Roll number and the marks: ");
         for (int i = 0; i < 6; i++) {
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
                }
            }
        
        System.out.println();
        System.out.println("Here is the matrix: ");
        // Printing side by side
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
            }
        sc.close();
    }
    
}
