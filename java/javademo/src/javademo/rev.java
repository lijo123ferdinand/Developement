package javademo;
import java.util.Scanner;

public class rev{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int con = 1;

        while (con == 1) {
            System.out.println("Enter the string to reverse:");
            String toReverse = scanner.nextLine();

            // Using StringBuilder to reverse the string
            StringBuilder reversed = new StringBuilder(toReverse).reverse();

            System.out.println("Reversed String: " + reversed);

            // Asking user whether to continue
            System.out.println("Do you want to reverse another string? (1 for Yes, 0 for No)");
            con = scanner.nextInt();
        }

        System.out.println("Program terminated.");
    }
}
