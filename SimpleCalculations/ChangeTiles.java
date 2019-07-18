package SimpleCalculations;

import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        double w = Double.parseDouble(input.nextLine());
        double l = Double.parseDouble(input.nextLine());
        int m = Integer.parseInt(input.nextLine());
        int o = Integer.parseInt(input.nextLine());

        double result = (n * n - m * o) / (w * l);
        double time = result * 0.2;

        System.out.println(result);
        System.out.println(time);
    }
}
