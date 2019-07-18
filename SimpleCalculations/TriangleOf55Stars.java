package SimpleCalculations;

public class TriangleOf55Stars {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
