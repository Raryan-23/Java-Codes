public class WaveformMatrix {
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
    public static void printWaveform(int[][] arr){
        int m =arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            if(i%2 ==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " -> ");
                }
            }
            else{
                for (int j =n-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " -> ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20}};
        System.out.println("Input Array: ");
        printArray(arr);
        System.out.println("Waveform: ");
        printWaveform(arr);
    }

}
