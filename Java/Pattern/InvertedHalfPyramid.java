import java.util.Scanner;

class InvertedHalfPyramid{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = sc.nextInt();
        int i = 0, j = 0, k = row;
        while(i < row){
            j = 0;
            k = row;
            while(k > i+1){
                System.out.print(" ");
                k--;
            }
            while(j < i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
