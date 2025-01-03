import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        double costPrice = sc.nextDouble();
        System.out.println("Enter the selling price:");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            System.out.println("Profit: " + (sellingPrice - costPrice));
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss: " + (costPrice - sellingPrice));
        } else {
            System.out.println("No Profit, No Loss.");
        }
    }
}
