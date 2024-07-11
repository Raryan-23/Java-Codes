// No Extra Space is used .

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{10,12,3},{1,25,33},{15,10,22}};

        int m= a.length;
        int n= a[0].length;
        //int[][] c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] += a[i][j];
            }      
        }
        System.out.println("New array after adding both the matrices: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
                }
                System.out.println();
                }
    }
}
