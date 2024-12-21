//WAP to check whether number is positive, negative or invalid.
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
