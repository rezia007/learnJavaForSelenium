package simpleJavaCodes;

import java.util.Scanner;

public class ScannerInputOutput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 1st number: ");
        int num1=scanner.nextInt();
        System.out.println("You entered: "+num1);

        System.out.println("Please enter 2nd number: ");
        int num2=scanner.nextInt();
        System.out.println("You entered: "+num2);

        System.out.println("Please enter 3rd number: ");
        int num3=scanner.nextInt();
        System.out.println("You entered: "+num3);


    }
}
