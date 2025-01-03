//WAP to enter all sides of triangle and check whether triangle is valid or not.
import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Enter sides of the triangle
        System.out.println("Enter the first side of the triangle:");
        int side1 = sc.nextInt();
        
        System.out.println("Enter the second side of the triangle:");
        int side2 = sc.nextInt();
        
        System.out.println("Enter the third side of the triangle:");
        int side3 = sc.nextInt();
        
        // Check if the triangle is valid
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
