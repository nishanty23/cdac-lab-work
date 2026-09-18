import java.util.Scanner;

class InvertedHalfPyramidNumbers{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        int i = row, j = 0, k = 1, x = 0;
        while(i > 0){
            j = i;
            k = 1;
            x = 1;
            while(j > 0){
                System.out.print(x + " ");
                x++;
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
