public class NestedLoopNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Outer loop: " + i + ", Inner loop: " + j);
            }
        }
    }
}
