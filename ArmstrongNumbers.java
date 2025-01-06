public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int original = num;
            int sum = 0;
            int digit;
            
            while (num > 0) {
                digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            }
            num = original;
        }
    }
}
