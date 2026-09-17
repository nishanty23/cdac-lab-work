import java.util.Scanner;

class HalfPyramid{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        int i = 0, j = 0;
        while(i < row){
            j = 0;
            while(j < i+1){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
