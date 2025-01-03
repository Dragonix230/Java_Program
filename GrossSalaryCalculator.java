import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void GrossSalaryCalculator(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary:");
        double basicSalary = sc.nextDouble();
        double HRA, DA;

        if (basicSalary <= 10000) {
            HRA = 0.2 * basicSalary;
            DA = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            HRA = 0.25 * basicSalary;
            DA = 0.9 * basicSalary;
        } else {
            HRA = 0.3 * basicSalary;
            DA = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + HRA + DA;
        System.out.println("Gross Salary: " + grossSalary);
    }
}
