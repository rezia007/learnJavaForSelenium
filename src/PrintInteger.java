import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int num=reader.nextInt();
        System.out.println("You entered: "+num);
    }
}
