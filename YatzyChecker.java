import java.util.Random;

public class YatzyChecker {
    public static void main(String[] args) {
        Random random = new Random();
        int dice;

        while (true) {
            dice = random.nextInt(6) + 1; // Generate a random number between 1 and 6
            System.out.println("Dice rolled: " + dice);

            if (dice == 6) {
                System.out.println("Yatzy!");
                break;
            }
        }
    }
}
