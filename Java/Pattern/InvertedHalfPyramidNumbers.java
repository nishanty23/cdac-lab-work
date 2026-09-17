import java.util.Scanner;

class InvertedHalfPyramidNumbers{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt(); // 3
        int i = row, j = 0, k = 1;
        while(i > 0){ // 3
            j = i; // 3
            k = 1;
            while(j > 0){ // 3 2 1
                System.out.print(j);
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
