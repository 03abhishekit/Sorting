 



public class selectionSort{

    public static void displayArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


   

    //  selectionSort
    public static void selectionSortInc(int arr[], int n){
        
        
        for(int i=0;i<n-1;i++){
           int  key = i ;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[key]){
                    key = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[key] ;
            arr[key] = temp;
        }
    }

    public static void selectionSortDec(int arr[], int n){
        
        for(int i=0;i<n-1;i++){
           int key = i;

            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[key]){
                    key = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
    }
      
    public static void main(String[] args) {
        
        int arr[] =  { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;

        displayArray(arr, n);
        selectionSortInc(arr, n);
        displayArray(arr, n);
        selectionSortDec(arr, n);
        displayArray(arr, n);
    }
}
