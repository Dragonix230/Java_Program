//WAP to check the grades of the students by entering their marks.
import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks (0-100):");
        int marks = sc.nextInt();
        
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }
    }
}
