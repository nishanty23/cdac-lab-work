import java.util.Scanner;

class BubbleSort{
    public void takeInput(int arr[], int size, Scanner sc){
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
    public void sortArr(int arr[], int size){
        int temp;
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void displayArr(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        BubbleSort obj1 = new BubbleSort();
        obj1.takeInput(arr, size, sc);
        obj1.sortArr(arr, size);
        obj1.displayArr(arr, size);
    }
}
////
