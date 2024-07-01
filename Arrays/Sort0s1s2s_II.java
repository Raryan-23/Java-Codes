/* It is the Dutch Flag Algorithm */
public class Sort0s1s2s_II {
    public static void main(String[] args) {
        int arr[]={2,1,2,0,1,0,2,0,1,0,1,1,0,0,2,2,2,0,0};
        
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
        if(arr[mid]==0){
            swap(arr,mid,low);
            mid++;low++;
        }
        else if(arr[mid]==1){
            mid++;
            }
        else{
            swap(arr,mid,high);
            high--;
        }
    }
    System.out.println("Sorted Array is: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
}

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
