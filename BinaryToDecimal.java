import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binary = sc.nextLine();

        try {
            int decimal = Integer.parseInt(binary, 2); // Convert binary to decimal
            System.out.println("Decimal equivalent: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }
    }
}
