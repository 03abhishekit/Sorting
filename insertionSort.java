
public class insertionSort{

    public static void displayArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


   

    //  insertionSort
    public static void insertionSortInc(int arr[], int n){
        
        int temp; int j;
        for(int i=0;i<n;i++){
           j = i-1;
           temp = arr[i];
           while(j >= 0 && arr[j] > temp){
                   arr[j+1] = arr[j];
                   j--;
                
           }
           arr[j+1] = temp;
        }
    }

    public static void insertionSortDec(int arr[], int n){
        
        int key; int j;
        for(int i=0;i<n;i++){
            key = arr[i];
            j = i-1;

            while(j >=0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
      
    public static void main(String[] args) {
        
        int arr[] =  { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;

        displayArray(arr, n);
        insertionSortInc(arr, n);
        displayArray(arr, n);
        insertionSortDec(arr, n);
        displayArray(arr, n);
    }
}
