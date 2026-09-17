import java.util.Scanner;

class Rectangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int col = sc.nextInt();
        //for(int i=0; i<row; i++){
        //    for(int j=0; j<col; j++){
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //}
        int i = 0, j = 0;
        while(i < row){
            j = 0;
            while(j < col){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
