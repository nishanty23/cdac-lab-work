import java.util.Scanner;

class HollowRectangle{
    public static void main(String [] args){
        int i = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter col: ");
        int col = sc.nextInt();
        while(i < row){
            j = 0;
            while(j < col){
                if(i == 0 || i == row-1 || j == 0 || j == col-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
