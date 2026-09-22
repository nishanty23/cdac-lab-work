import java.util.Scanner;

class LinearSearch{
    public void takeInput(int arr[], int size, Scanner sc){
        System.out.print("Enter elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
    public void displayArr(int arr[], int size){
        System.out.print("Elements of the array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int searchEle(int arr[], int size, int ele){
        int index = -1;
        for(int i=0; i<size; i++){
            if(arr[i] == ele){
                index = i;
                return index;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        LinearSearch obj1 = new LinearSearch();
        obj1.takeInput(arr, size, sc);
        obj1.displayArr(arr, size);
        System.out.print("Enter the ele: ");
        int ele = sc.nextInt();
        int index = obj1.searchEle(arr, size, ele);
        if(index == -1){
            System.out.println(ele + " is not present in the arr");
        }
        else{
            System.out.println("The index at which " + ele + " was found is: " + index);
        }
    }
}
