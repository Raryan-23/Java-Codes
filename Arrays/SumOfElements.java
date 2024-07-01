import java.util.Scanner;
class SumOfElements{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int sum=0;
        int[] myArr = new int[n];
        System.out.println("Enter the elements: \n");
        for(int i=0;i<n;i++){
            myArr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum += myArr[i];
        }
        System.out.println("The sum of elements is: "+ sum);
        sc.close();
    }
}