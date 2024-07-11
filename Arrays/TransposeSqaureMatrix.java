public class TransposeSqaureMatrix {
    //funtion to print my 2D array.
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
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{5,6,7},{8,9,10}};
        int m =arr.length;
        int n = arr[0].length;
        System.out.println("The original square Matrix: ");
        printArray(arr);   

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            
        }
        System.out.println("Transpose: ");
        printArray(arr);
    }
}
