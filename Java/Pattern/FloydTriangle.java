import java.util.Scanner;

class FloydTriangle{
    public void displayPattern(int row){
        int count = 1;
        int i = 1, j = 1;
        while(i <= row){
            j = 1;
            while(j <= i){
                //System.out.print(count + " ");
                System.out.printf("%-4d", count);
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        FloydTriangle obj1 = new FloydTriangle();
        obj1.displayPattern(row);
    }
}
