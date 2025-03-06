

public class bubbleSort{

    public static void displayArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


    //  bubbleSort
    public static void bubbleSortInc(int arr[], int n){
        boolean swapped = false;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-1-i;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                    }
            }
            if(swapped == false){
                break;
            }
        }
    }

    public static void bubbleSortDec(int arr[], int n){
        boolean swapped = false;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-1-i;j++){
                    if(arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                    }
            }
            if(swapped == false){
                break;
            }
        }
    }
      
    public static void main(String[] args) {
        
        int arr[] =  { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;

        displayArray(arr, n);
        bubbleSortInc(arr, n);
        displayArray(arr, n);
        bubbleSortDec(arr, n);
        displayArray(arr, n);
    }
}