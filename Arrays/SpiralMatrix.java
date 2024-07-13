public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("The Input matrix is: ");
        printArray(matrix);
        System.out.println("The Spiral Matrix is: ");
        Spiral(matrix);
    }

    public static void printArray(int[][] arr) {
        int m =arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
                System.out.println();
        }
                System.out.println();
    }

    public static void Spiral(int [][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int minRow = 0;
        int minCol = 0;
        int maxRow = m - 1;
        int maxCol = n - 1;

        while(minRow<=maxRow && maxRow<=maxCol){

            for(int j = minCol; j<=maxCol; j++){
                System.out.print(arr[minRow][j] + " ");
            }
            minRow++;

            if(minRow > maxRow || minCol > maxCol)  break;
            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(arr[i][maxCol] + " ");
            }       
            maxCol--;

            if(minRow > maxRow || minCol > maxCol)  break;
            for (int j = maxCol;j >= minCol ; j--) {
                System.out.print(arr[maxRow][j] + " ");
            }
            maxRow--;

            if(minRow > maxRow || minCol > maxCol)  break;
            for (int i = maxRow; i >= minRow; i--) {
                System.out.print(arr[i][minCol] + " ");
            }
            minCol++;
        }   
    }
}
