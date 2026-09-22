import java.util.Scanner;

class SimpleFunctions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String fullName1 = sc.nextLine();
        System.out.println("Length of the String is: " + fullName1.length());
        System.out.print("The full name of the person is: ");
        for(int i=0; i<fullName1.length(); i++){
            System.out.print(fullName1.charAt(i));
        }
        System.out.println();

        System.out.print("Enter a string: ");
        String fullName2 = sc.nextLine();
        if(fullName1.compareTo(fullName2) > 0){
            System.out.println(fullName1 + " is greater than " + fullName2);
        }
        else if(fullName1.compareTo(fullName2) == 0){
            System.out.println(fullName1 + " is equal to " + fullName2);
        }
        else{
            System.out.println(fullName1 + " is less than " + fullName2);
        }

        String fullName3 = fullName1.substring(4);
        System.out.println("String 3 is a substring of String 1 starting from 4th index: " + fullName3);
    }
}
