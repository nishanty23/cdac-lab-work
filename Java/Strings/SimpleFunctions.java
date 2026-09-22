import java.util.Scanner;

class SimpleFunctions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String fullName = sc.nextLine();
        System.out.println("Length of the String is: " + fullName.length());
        System.out.print("The full name of the person is: ");
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i));
        }
        System.out.println();
    }
}
