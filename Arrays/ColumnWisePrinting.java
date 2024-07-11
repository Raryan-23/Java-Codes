//867. TRANSPOSE MATRIX
public class ColumnWisePrinting {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5,6,7,8},{1,2,3,8}};
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
                }
                System.out.println();
                }
        // Storing the transpose into a different Array.
        System.out.println();
        int[][] arr2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = arr[j][i];
            }
        }
        //print elements of arr2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
                System.out.println();
        }
    }
}
