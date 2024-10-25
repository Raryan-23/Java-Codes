public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,60,2,49,99,16,28,21};
        int n=arr.length;
        int[] ans = new int[n];
        ans[n-1]=-1;
        int NextGreatestElement = arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]= NextGreatestElement;
            NextGreatestElement = Math.max(NextGreatestElement, arr[i]);
        }

        System.out.println("NEW ARRAY: ");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
    
}
