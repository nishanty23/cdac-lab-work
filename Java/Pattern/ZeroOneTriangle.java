import java.util.Scanner;

class ZeroOneTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        //int i = 0, j = 0, count;
        //while(i < row){
        //    j = 0;
        //    if(i % 2 == 0){
        //        count = 1;
        //    }
        //    else{
        //        count = 0;
        //    }
        //    while(j <= i){
        //        System.out.print(count + " ");
        //        j++;
        //        if(count == 1){
        //            count = 0;
        //        }
        //        else{
        //            count = 1;
        //        }
        //    }
        //    System.out.println();
        //    i++;
        //}

        for(int a=1; a<=row; a++){
            for(int b=1; b<=a; b++){
                if((a+b)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
