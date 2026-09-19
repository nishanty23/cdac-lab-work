import java.util.Scanner;

class Factorial{
    public int displayFact(int n){
        if(n == 0){
            return 1;
        }
        int i = n;
        int fact = 1;
        while(i > 0){
            fact = fact * i;
            i--;
        }
        return fact;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n < 0){
            System.out.print("Please enter a number greater than or equal to 0: ");
            n = sc.nextInt();
        }
        Factorial obj1 = new Factorial();
        System.out.println("Factorial of " + n + " is: " + obj1.displayFact(n));
    }
}
