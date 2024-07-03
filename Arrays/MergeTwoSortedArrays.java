class MergeTwoSortedArrays{
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,11};
        int[] arr2 = {2,4,6,8,10,12,14};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        int n=arr1.length;
        int m=arr2.length;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
                
            }else{
                arr3[k] = arr2[j];
                j++;
                
                }
                k++;
                }
                
        // This is to fill out the remaning elements of the array when one iterator gets over.
            while(i<n){
                arr3[k] = arr1[i];
                i++;
                k++;
                }
            while(j<m){
                arr3[k] = arr2[j];
                j++;
                k++;
                }
    for(int l=0;l<arr3.length;l++){
        System.out.print(arr3[l]+" ");
        }
    
        System.out.println();
                                
                            
    }
}