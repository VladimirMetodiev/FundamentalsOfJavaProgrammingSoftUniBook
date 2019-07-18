package SimpleCalculations;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float usd = Float.parseFloat(input.nextLine());
        double bgn = usd * 1.79549;

        System.out.printf("%.2f BGN", bgn);
    }
}
